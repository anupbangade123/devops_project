package com.MailTest.demo.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sendMail")
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class MailController {


    //private  EmailService emailService;

    @GetMapping(value = "/email")
    public ResponseEntity<String> sendEmail(){
        log.info("inside sendEmail() start");
        String text= "Please check Sheet details-  "+"\n\n"+
                "<table width='100%' border='1' align='center'>"
                + "<tr align='center'>"
                + "<td><b>WE Sheet: <b></td>"
                + "<td><a href=\"https://docs.google.com/spreadsheets/d/1Y7SobGQfzxrHETXczVMqKDpAgDBxccbktDddnyLpVb4/edit#gid=1782207282\">WE Sheet Link </a></td>"
                + "</tr>"
                + "<tr align='center'>"
                + "<td><b>Employee Data for Exit Portal : <b></td>"
                + "<td><a href=\"https://docs.google.com/spreadsheets/d/1Y7SobGQfzxrHETXczVMqKDpAgDBxccbktDddnyLpVb4/edit#gid=0\">Employee Data for Exit Portal Link </a><</td>"
                + "</tr>"
                + "<tr align='center'>"
                + "<td><b>IT Sheet : <b></td>"
                + "<td><a href=\"https://docs.google.com/spreadsheets/d/1uizYq0YcapB1k_UZX7QA6bC_MRqxZTZe8pS9sApNWIo/edit#gid=2009637454\">IT Sheet  Link </a> </td>"
                + "</tr>"
                + "</table>";
        //emailService.send("anupn.bangade@gmail.com", "anup.bangade@gmail.com","Test HTML Mail", text);
        return new ResponseEntity<>("Send", HttpStatusCode.valueOf(200));
    }
}
