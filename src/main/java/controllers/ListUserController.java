package controllers;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

public class ListUserController {

	@Controller
	public class ListUsersController {
	
	 // @RequestMapping("/listUsers")
	 //   @RequestMapping(value = "/listUsers" , method= RequestMethod.GET)
	  public String listUsers(ModelMap model) {
	
	    RestTemplate restTemplate = new RestTemplate();
	    
	   //String url="http://localhost:8080/SpringServiceJsonSample/service/user/";  
		//String url="http://tools.fifaguide.com/api/topten/pace";  
        String url = "http://www.zillow.com/webservice/GetUpdatedPropertyDetails.htm?zws-id=X1-ZWz1esttgz9ekr_9ljvt&zpid=48749425";
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		List<LinkedHashMap> users=restTemplate.getForObject(url, List.class);
	  // return new ModelAndView("listUsers", "users", users);
	     model.addAttribute( "users", users);
	     return "listUsers";
	     }

	}
}
