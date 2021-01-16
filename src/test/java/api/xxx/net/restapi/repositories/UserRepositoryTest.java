package api.xxx.net.restapi.repositories;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import api.xxx.net.restapi.repositries.UserRepository;

@SpringBootTest
@Configuration
public class UserRepositoryTest{
    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void findByEmailTest() {
        String inspectedEmail = "test@test.com";

        userRepository.findByEmail(inspectedEmail);
    }

    @Test
    public void findAllTest() {
        userRepository.findAll();
    }

}
