package neeraj.rest.webservices.neerajwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Neeraj Auchar");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Neeraj" , "Auchar"));
    }


    @GetMapping(path = "/person" , params = "version=2")
    public PersonV2 getSecondVersionOfPersononRequestParameter(){
        return new PersonV2(new Name("Neeraj" , "Auchar"));
    }

    @GetMapping(path = "/person" , params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Neeraj Auchar");
    }

    @GetMapping(path = "/person/header" , headers  = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeaders(){
        return new PersonV1("Neeraj Auchar");
    }
}
