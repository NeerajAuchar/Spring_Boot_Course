package neeraj.rest.webservices.neerajwebservices;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;
    public HelloWorldController(MessageSource messageSource){
        this.messageSource= messageSource;
    }

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

    @GetMapping( path = "hello-world-internationalized")
    public String helloworldinternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return   messageSource.getMessage("good.morning.message",null,"Default Message",locale);

    }
}
