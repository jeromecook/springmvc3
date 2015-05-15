package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class SpringMVC3Controller {
 
    @RequestMapping("/hello")
    public String sayHelloToOpenShift(){
    	
        return "hello";
    }
    
    @RequestMapping(value = "/index" , method= RequestMethod.GET)
    public String homePage(ModelMap model){
    	model.addAttribute("message", "Error from Controller");
        return "index";
    }
}