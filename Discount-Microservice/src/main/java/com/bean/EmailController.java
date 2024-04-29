package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.EmailService;

//Annotation
@RestController
//Class
@CrossOrigin
@RequestMapping("/send")
public class EmailController {

 @Autowired private EmailService emailService;

 @PostMapping("/mail")
 public String
 sendMail(@RequestBody EmailDetails details)
 {
     String status
         = emailService.sendSimpleMail(details);

     return status;
 }


}
