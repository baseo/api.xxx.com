package api.xxx.net.restapi.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import api.xxx.net.restapi.entities.User;
import api.xxx.net.restapi.repositries.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest{

    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void findByEmailTest() {
        User testUser = new User();
        testUser.setFirstName("Einstein");
        testUser.setLastName("Astro");
        testUser.setEmail("test@test.com");
        testUser.setPassword("test");

        userRepository.save(testUser);
        
        String inspectedEmail = "test@test.com";

        userRepository.findByEmail(inspectedEmail);
    }

    @Test
    public void findAllTest() {
        userRepository.findAll();
    }

}
