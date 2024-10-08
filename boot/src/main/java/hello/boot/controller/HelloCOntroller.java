package hello.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {

    @GetMapping("/hello-spring")
    public String Hello(){
        System.out.println("HelloCOntroller.Hello");
        return "hello spring!";
    }
}
