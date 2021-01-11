package api.xxx.net.restapi.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class RestApiSecurityConfiguration extends WebSecurityConfigurerAdapter{
    
    @Override
    public void configure(WebSecurity web) throws Exception {

        web.ignoring().antMatchers("/static/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * Remaining tasks
         * error handling
         * xss countermeasure
         * csrf optimize
         * OAuth2
         * form Login setting
         * Logout setting
         */
        http
            .authorizeRequests()
                .mvcMatchers("/api/**")
                    .authenticated()
            .and()
            .httpBasic()
                .realmName("To access ERP Database")
            .and()
            .csrf()
                .disable();
    }
}
