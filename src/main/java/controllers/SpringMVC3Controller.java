package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class SpringMVC3Controller {
 
    @RequestMapping("/hello")
    public String sayHelloToOpenShift(){
        return "hello";
    }
    
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }
}