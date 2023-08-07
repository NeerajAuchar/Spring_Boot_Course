package neeraj.rest.webservices.neerajwebservices.jpa;

import jakarta.validation.Valid;
import neeraj.rest.webservices.neerajwebservices.User.User;
import neeraj.rest.webservices.neerajwebservices.User.UserDaoService;
import neeraj.rest.webservices.neerajwebservices.User.UserNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@RestController
public class UserResourceJpa {
    private UserRepository service;

    public UserResourceJpa(UserDaoService service) {

        this.service = service;
    }

    @GetMapping("/jpa/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();

    }

    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retrieveUsers(@PathVariable int id) throws UserNotFoundException {
        User user = service.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id:" + id);
        }
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    @DeleteMapping("/jpa/users/{id}")
    public void deleteUsers(@PathVariable int id) throws UserNotFoundException {
        service.deleteById(id);

    }


    @PostMapping("/jpa/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();

    }
}


