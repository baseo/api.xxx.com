package api.xxx.net.restapi.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import api.xxx.net.restapi.entities.User;

@RunWith(SpringRunner.class)
@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
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

}
