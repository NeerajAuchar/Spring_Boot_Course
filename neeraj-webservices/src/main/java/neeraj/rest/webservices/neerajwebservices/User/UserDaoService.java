package neeraj.rest.webservices.neerajwebservices.User;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Neeraj" , LocalDate.now().minusYears(21)));
        users.add(new User(2,"Raj" , LocalDate.now().minusYears(25)));
        users.add(new User(3,"Ajinkya" , LocalDate.now().minusYears(22)));
        users.add(new User(4,"Devesh" , LocalDate.now().minusYears(30)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
