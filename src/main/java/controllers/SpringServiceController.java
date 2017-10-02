package controllers;

import model.ProcessTO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/service/greeting")

public class SpringServiceController {

 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
 
 public @ResponseBody String getGreeting(@PathVariable String name) {

     ProcessTO pro = new ProcessTO();
    // Process proc = new Process();
	 if(name == null)
    	 name = "no value passed";
	 String result="Hello "+name; 

  return result;

 }

}

