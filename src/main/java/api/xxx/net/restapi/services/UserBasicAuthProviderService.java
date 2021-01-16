package api.xxx.net.restapi.services;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import api.xxx.net.restapi.entities.User;
import api.xxx.net.restapi.repositries.UserRepository;

public class UserBasicAuthProviderService implements AuthenticationProvider {

    Logger logger = LoggerFactory.getLogger(UserBasicAuthProviderService.class);
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //email
        String inspectedUserAccountId = authentication.getName();
        //password
        String inspectedPassword = authentication.getCredentials().toString();

        if (inspectedUserAccountId.isBlank() || inspectedPassword.isBlank()) {
            throw new BadCredentialsException("account id or passward is not set.");
        }

        logger.info("😁:" + inspectedUserAccountId);
        logger.info("🔓:" + inspectedPassword);

        User retrievedUserResult = userRepository.findByEmail(inspectedUserAccountId);

        if (Objects.nonNull(retrievedUserResult) 
            && retrievedUserResult.getEmail().equals(inspectedUserAccountId)
            && retrievedUserResult.getPassword().equals(inspectedPassword)
        ){
            return 
                new UsernamePasswordAuthenticationToken(
                                                        inspectedUserAccountId, 
                                                        inspectedPassword, 
                                                        authentication.getAuthorities()
                                                        );
        } else {
            throw new BadCredentialsException("account id or passward is not correct.");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
    
}
