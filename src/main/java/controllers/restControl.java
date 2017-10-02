package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index/rest")
public class restControl {
	
	@RequestMapping(value="{/name}", method = RequestMethod.GET)
	public @ResponseBody String getMethod(){
		
		String smoke = "smoke house";
		return smoke; 
	}
	

}
