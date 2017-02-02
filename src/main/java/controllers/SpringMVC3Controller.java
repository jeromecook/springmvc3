package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.Spring;

import model.ConstructorTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping(value = "/search", method=RequestMethod.GET)
    public ModelAndView search(){  
    	String url = "http://widget.proxiopro.com/CRMLS/PropertyDetails.aspx?id=0&AGENT=&OFFICE=&PropertyId=52484181&CountryId=1&RegionId=CA&RegionName=California&CityId=-1&CityName=&PostCode=90815&CurrencyId=490&GarageCount=-1&BedRoomCount=-1&BathRoomCount=-1&yearBuilt=0&yearBuiltTo=0&MinPrice=900000&MaxPrice=0&ClassId=-1&PropStatus=90&AreaUnit=1&page=1";
    	return new ModelAndView("search","featured", url);    	
    }
    @RequestMapping(value = "/searchButton", method=RequestMethod.GET)
    public ModelAndView search(@RequestParam("primary") String url0){
    	
    	
    	 
    	if( !url0.equals(null))
    		 return new ModelAndView("search","featured", url0);
    	     
    	   
    	String url = "http://widget.proxiopro.com/CRMLS/PropertyDetails.aspx?id=0&AGENT=&OFFICE=%20%20%20%20%20%20%20%20&PropertyId=51033392&CountryId=1&RegionId=CA&RegionName=California&CityId=-1&CityName=&PostCode=&CurrencyId=490%20%20%20%20%20%20%20%20&GarageCount=-1&BedRoomCount=-1&BathRoomCount=-1&yearBuilt=0&yearBuiltTo=0&MinPrice=0&MaxPrice=0&ClassId=-1%20%20%20%20%20%20%20%20&PropStatus=90&AreaUnit=1&page=1";
    	return new ModelAndView("search","featured", url);    	
    }
    
    @RequestMapping(value = "/search1", method=RequestMethod.GET)
    public ModelAndView search1(@RequestParam("featured1") String url0){
    	
    	
    	 
    	if( !url0.equals(null))
    		 return new ModelAndView("search","featured", url0);
    	     
    	   
    	String url = "http://widget.proxiopro.com/CRMLS/PropertyDetails.aspx?id=0&AGENT=&OFFICE=%20%20%20%20%20%20%20%20&PropertyId=51033392&CountryId=1&RegionId=CA&RegionName=California&CityId=-1&CityName=&PostCode=&CurrencyId=490%20%20%20%20%20%20%20%20&GarageCount=-1&BedRoomCount=-1&BathRoomCount=-1&yearBuilt=0&yearBuiltTo=0&MinPrice=0&MaxPrice=0&ClassId=-1%20%20%20%20%20%20%20%20&PropStatus=90&AreaUnit=1&page=1";
    	return new ModelAndView("search","featured", url);    	
    }
    
    @RequestMapping(value = "/search2", method=RequestMethod.GET)
    public ModelAndView search2(@RequestParam("featured2") String url)
    		{
    	
    	
    	if( !url.equals(null)){
    		 return new ModelAndView("search","featured", url);
    	     }
    	     
    	   
    	String urlCommon = "http://widget.proxiopro.com/CRMLS/PropertyDetails.aspx?id=0&AGENT=&OFFICE=%20%20%20%20%20%20%20%20&PropertyId=51033392&CountryId=1&RegionId=CA&RegionName=California&CityId=-1&CityName=&PostCode=&CurrencyId=490%20%20%20%20%20%20%20%20&GarageCount=-1&BedRoomCount=-1&BathRoomCount=-1&yearBuilt=0&yearBuiltTo=0&MinPrice=0&MaxPrice=0&ClassId=-1%20%20%20%20%20%20%20%20&PropStatus=90&AreaUnit=1&page=1";
    	return new ModelAndView("search","featured", urlCommon);    	
    }
    @RequestMapping(value = "/search3", method=RequestMethod.GET)
    public ModelAndView search3(@RequestParam("featured3") String url)
    		{
    	
    	if( !url.equals(null))
    		 return new ModelAndView("search","featured", url);
    	     
    	   
    	String urlCommon = "http://widget.proxiopro.com/CRMLS/PropertyDetails.aspx?id=0&AGENT=&OFFICE=%20%20%20%20%20%20%20%20&PropertyId=51033392&CountryId=1&RegionId=CA&RegionName=California&CityId=-1&CityName=&PostCode=&CurrencyId=490%20%20%20%20%20%20%20%20&GarageCount=-1&BedRoomCount=-1&BathRoomCount=-1&yearBuilt=0&yearBuiltTo=0&MinPrice=0&MaxPrice=0&ClassId=-1%20%20%20%20%20%20%20%20&PropStatus=90&AreaUnit=1&page=1";
    	return new ModelAndView("search","featured", urlCommon);    	
    }
    
    @RequestMapping(value = "/search4", method=RequestMethod.GET)
    public ModelAndView search4(@RequestParam("featured4") String url){
    	System.out.println("url printed out: "+ url);
    	
    	if( !url.equals(null))
    		 return new ModelAndView("search","featured", url);
    	     
    	   
    	String urlCommon = "http://widget.proxiopro.com/CRMLS/PropertyDetails.aspx?id=0&AGENT=&OFFICE=%20%20%20%20%20%20%20%20&PropertyId=51033392&CountryId=1&RegionId=CA&RegionName=California&CityId=-1&CityName=&PostCode=&CurrencyId=490%20%20%20%20%20%20%20%20&GarageCount=-1&BedRoomCount=-1&BathRoomCount=-1&yearBuilt=0&yearBuiltTo=0&MinPrice=0&MaxPrice=0&ClassId=-1%20%20%20%20%20%20%20%20&PropStatus=90&AreaUnit=1&page=1";
    	return new ModelAndView("search","featured", urlCommon);    	
    }
    
    
    @RequestMapping("/listUsers")
   
         public ModelAndView listUsers() {
    	 System.out.println("listUsers");
    	 
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

      /// String url="http://localhost:8080/SpringServiceJsonSample/service/user/"; 
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