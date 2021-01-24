package api.xxx.net.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import api.xxx.net.restapi.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

    public User findByEmail(String email);
     
}
