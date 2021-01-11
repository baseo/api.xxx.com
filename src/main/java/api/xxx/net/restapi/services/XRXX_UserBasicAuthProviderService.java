package api.xxx.net.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import api.xxx.net.restapi.entities.User;
import api.xxx.net.restapi.repositries.UserRepository;

public class XRXX_UserBasicAuthProviderService implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //email
        String inspectedUserAccountId = authentication.getName();
        //password
        String inspectedPassword = authentication.getCredentials().toString();

        User retrievedUserResult = null;

        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
