package neeraj.rest.webservices.neerajwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @GetMapping(path = "hello-world")
    public  String helloWorld(){
        return "Welcome to Our world";
    }
    @GetMapping(path = "hello-world-joe")
    public  Helloworldjoe helloWorldjoe(){
        return new Helloworldjoe ("Welcome to Our world");
    }


}
