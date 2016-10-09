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
	private ConstructorTest contTest;
	
	
  
	SpringMVC3Controller(){
	   System.out.println("defalut contructor" + contTest);
	 //  System.out.println("hitting contsTest: "+ contTest.shoot());
   }
   
   SpringMVC3Controller(ConstructorTest contTest){
	  System.out.println("in Spring MVC3 Controller"); 
	  this.contTest = contTest;
   }
    @RequestMapping("/hello")
    public String sayHelloToOpenShift(){
    	
        return "hello";
    }
    
    @RequestMapping(value = "/index" , method= RequestMethod.GET)
    public String homePage(ModelMap model){
    	Document doc;
    	Elements tableTag = null;
    	Elements list = null;
    	Elements bob = null;
    	
    	try {
			 doc = Jsoup
					.connect(
							"http://www.scdslsoccer.com/standings/2014FallStandings/")
					.get();
    		
			String title = doc.title();
			 //boys = doc.select("table.stand-list-tbl-1");
			//tableTag = doc.getElementsByClass("tbl-stand-list");
			//Elements a = tableTag.get(0).getElementsByTag("a");
			Element a = doc.select("tbl-stand-list").first();
			String stand = a.text();
			System.out.println(stand);
			// list = tableTag.getAllElements();
		//	tableTag = doc.getElementsByClass("tg-hd");
		//	bob = tableTag.get(0).getElementsByTag("td");
			
			// list = tableTag.get(0).getElementsByTag("tr");
			 //bob = tableTag.getElementsByAttribute("tr");

			System.out.println(title);
			//System.out.println("length of element: " + a.size());
			/*
			for(Element ttag: a){
				
				 System.out.println(ttag);
			}
			 */
			
			for(Element lst: list)
			System.out.println(lst);
    		/*doc = Jsoup.parse("<html><tr><td> Special list </td></tr></html>");
    		boys = doc.select("td");
    		System.out.println(boys);*/

		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
    	
		System.out.println("in the homepage constroller");
    	model.addAttribute("message", list);
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
    
    @RequestMapping(value = "/portfolio", method=RequestMethod.GET)
    public String noSideBar(ModelMap model){
    	
    	model.addAttribute("message", "no sidebar constroller");
    	return "portfolio";
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

    
    
    
    public void consTest(ConstructorTest ct){
    	ct.shoot();
    	System.out.println("here" + ct);
    
    }
	/*public ConstructorTest getContTest() {
		return contTest;
	}
	public void setContTest(ConstructorTest contTest) {
		this.contTest = contTest;
	}
*/
}