package api.xxx.net.restapi.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import api.xxx.net.restapi.entities.User;
import api.xxx.net.restapi.repositries.UserRepository;

@RunWith(SpringRunner.class)
@DataJdbcTest
public class UserRepositoryTest{

    @Autowired
    private TestEntityManager manager;

    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void findByEmailTest() {
        User testUser = new User();
        testUser.setFirstName("Einstein");
        testUser.setLastName("Astro");
        testUser.setEmail("test@test.com");
        testUser.setPassword("test");
        
        manager.persistAndFlush(testUser);

        String inspectedEmail = "test@test.com";

        userRepository.findByEmail(inspectedEmail);
    }

    @Test
    public void findAllTest() {
        userRepository.findAll();
    }

}
