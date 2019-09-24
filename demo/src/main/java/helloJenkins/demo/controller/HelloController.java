package helloJenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "hello springboot build by jenkins";
    }
}
