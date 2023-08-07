package neeraj.rest.webservices.neerajwebservices.jpa;

import neeraj.rest.webservices.neerajwebservices.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
    
}
