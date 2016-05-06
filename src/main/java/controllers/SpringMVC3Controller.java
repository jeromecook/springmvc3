package controllers;

import java.util.LinkedHashMap;
import java.util.List;

import model.ConstructorTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
	
	
  
	/*SpringMVC3Controller(){
	   System.out.println("defalut contructor" + contTest);
	 //  System.out.println("hitting contsTest: "+ contTest.shoot());
   }
   
   SpringMVC3Controller(ConstructorTest contTest){
	  System.out.println("in Spring MVC3 Controller"); 
	  this.contTest = contTest;
   }*/
    @RequestMapping("/hello")
    public String sayHelloToOpenShift(){
    	
        return "hello";
    }
    
    @RequestMapping(value = "/index" , method= RequestMethod.GET)
    public String homePage(ModelMap model){
    	Document doc;
    	Elements boys = null;
    	
    	try {
			 doc = Jsoup
					.connect(
							"http://www.scdslsoccer.com/standings/2014FallStandings/")
					.get();
    		
			String title = doc.title();
			 boys = doc.select("table.stand-list-tbl-1");
			System.out.println(title);
			System.out.println(boys);
    		/*doc = Jsoup.parse("<html><tr><td> Special list </td></tr></html>");
    		boys = doc.select("td");
    		System.out.println(boys);*/

		} catch (Exception e) {
			// TODO: handle exception
		}
    	
		System.out.println("in the homepage constroller");
    	model.addAttribute("message", boys);
        return "index";
    }
    @RequestMapping(value = "/left-sidebar" , method= RequestMethod.GET)
    public String leftSideBar(ModelMap model){
    	System.out.println("left in the homepage constroller");
    	model.addAttribute("message", "left Controller");
        return "left-sidebar";
    }
    @RequestMapping(value = "/right-sidebar" , method= RequestMethod.GET)
    public String rightSideBar(ModelMap model){
    	System.out.println(" right in the homepage constroller");
    	model.addAttribute("message", "right Controller");
        return "right-sidebar";
    }
    @RequestMapping(value = "/no-sidebar", method=RequestMethod.GET)
    public String noSideBar(ModelMap model){
    	System.out.println("no sidebar in the homepage constroller");
    	model.addAttribute("message", "no sidebar constroller");
    	return "no-sidebar";
    }
    
    @RequestMapping("/listUsers")
   
         public ModelAndView listUsers() {
    	 System.out.println("listUsers");
    	 
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

      // String url="http://localhost:8080/SpringServiceJsonSample/service/user/"; 
       String url ="http://api.football-data.org//alpha/soccerseasons/";
       String url_league ="http://api.football-data.org/alpha/soccerseasons/{BL1}/leagueTable/";
       List<LinkedHashMap> users=restTemplate.getForObject(url, List.class);
          System.out.println("users: " + users);
             return new ModelAndView("index", "users", users);
    
         }

    
    
    
    public void consTest(ConstructorTest ct){
    	//ct.shoot();
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