package api.xxx.net.restapi.repositories;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import api.xxx.net.restapi.repositries.UserRepository;

@SpringBootTest
public class UserRepositoryTest{

    private static UserRepository userRepository;
    
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
