package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import model.ConstructorTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;




 
@Controller
public class SpringMVC3Controller {
	
    
    @RequestMapping(value = "/index" , method= RequestMethod.GET)
    public String homePage(ModelMap model){
    	

    	model.addAttribute("message", model);
        return "index";
    }
    
    @RequestMapping(value = "/services" , method= RequestMethod.GET)
    public String leftSideBar(ModelMap model){
    	
    	model.addAttribute("message", "left Controller");
        return "services";
    }
    
    @RequestMapping(value = "/contact" , method= RequestMethod.GET)
    public String rightSideBar(ModelMap model){
    	
    	model.addAttribute("message", "right Controller");
        return "contact";
    }
    
    @RequestMapping(value = "/list", method=RequestMethod.GET)
    public String noSideBar(ModelMap model){
    	
    	model.addAttribute("message", "no sidebar constroller");
    	return "list";
    }
    @RequestMapping(value = "/buy", method=RequestMethod.GET)
    public String buying(ModelMap model){
    	
    	model.addAttribute("message", "buying mode");
    	return "buy";
    }
    @RequestMapping(value = "/blog", method=RequestMethod.GET)
    public String blog(ModelMap model){
    	
    	model.addAttribute("message", "no sidebar constroller");
    	return "blog";
    }
    
    @RequestMapping(value = "/about", method=RequestMethod.GET)
    public String about(ModelMap model){
    	
    	model.addAttribute("message", "no sidebar constroller");
    	return "about";
    }
    @RequestMapping(value = "/emailForm", method=RequestMethod.GET)
    public String emailForm(ModelMap model){
    	
    	model.addAttribute("message", "emailForm");
    	return "emailForm";
    }
    
    @RequestMapping("/listUsers")
   
         public ModelAndView listUsers() {
    	 System.out.println("listUsers");
    	 
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

      // String url="http://localhost:8080/SpringServiceJsonSample/service/user/"; 
       //String url ="http://api.football-data.org//alpha/soccerseasons/";
       String url = "http://www.zillow.com/webservice/GetUpdatedPropertyDetails.htm?zws-id=X1-ZWz1esttgz9ekr_9ljvt&zpid=48749425";
        String url_league ="http://api.football-data.org/alpha/soccerseasons/{BL1}/leagueTable/";
       //List<LinkedHashMap> users=restTemplate.getForObject(url, List.class);
      //String users=restTemplate.getForObject(url, String.class);
      String users = "hello";
     // System.out.println("UnMarshall" + UnMarshXml.jaxbXMLToObject(url));
      
      
        System.out.println("users: " + users);
             return new ModelAndView("index", "users", users);
    
         }

    
    
    
   
}