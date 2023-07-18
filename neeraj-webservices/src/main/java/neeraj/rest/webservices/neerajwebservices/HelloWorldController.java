package neeraj.rest.webservices.neerajwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping( path = "hello-world")
    public String helloworld(){
        return "Welcome to our world";

    }

    @GetMapping( path = "hello-world-neeraj")
    public helloworldneeraj helloworldneeraj(){
        return new helloworldneeraj ("Welcome to our world");

    }

    @GetMapping( path = "hello-world/path-variable/{name}")
    public helloworldneeraj helloworldneerajPathVariable(@PathVariable String name){
        return new helloworldneeraj ( String.format("Hello World , %s" ,name));


    }
}
