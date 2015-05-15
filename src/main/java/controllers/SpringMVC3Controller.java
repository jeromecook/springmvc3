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
    	System.out.println("in the homepage constroller");
    	model.addAttribute("message", "Error from Controller");
        return "index";
    }
    @RequestMapping(value = "/left-sidebar" , method= RequestMethod.GET)
    public String leftSideBar(ModelMap model){
    	model.addAttribute("message", "Error from Controller");
        return "left-sidebar";
    }
    @RequestMapping(value = "/right-sidebar" , method= RequestMethod.GET)
    public String rightSideBar(ModelMap model){
    	model.addAttribute("message", "Error from Controller");
        return "right-sidebar";
    }
    @RequestMapping(value = "/no-sidebar", method=RequestMethod.GET)
    public String noSideBar(ModelMap model){
    	model.addAttribute("message", "no sidebar constroller");
    	return "no-sidebar";
    }
}