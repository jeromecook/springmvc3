package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
@Controller
@RequestMapping("/sendEmail.do")
public class SendEmailController {
 
    @Autowired
    private JavaMailSender mailSender;
     
    @RequestMapping(method = RequestMethod.POST)
    public String doSendEmail(HttpServletRequest request) {
        // takes input from e-mail form
        String name = request.getParameter("name");
        String emailAddress = request.getParameter("emailAddress");
        String message = request.getParameter("message");
         
        // prints debug info
        System.out.println("To: " + name);
        System.out.println("Subject: " + emailAddress);
        System.out.println("Message: " + message);
         
        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(emailAddress);
        email.setSubject(name);
        email.setText(message);
         
        // sends the e-mail
        mailSender.send(email);
         
        // forwards to the view named "Result"
        return "Result";
    }
}