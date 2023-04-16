package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }
    @GetMapping(path = "/echo/{message}")
    public String echo(
            @PathVariable(name = "message") String msg
            ){
        System.out.println("echo message : " + msg);
        msg.toUpperCase();
        return msg;

    }


    // http://localhost:8080/book?category=IT&issuedYear=2023&issued-month=01&issued-day=31
    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued-day") String issuedDay
            ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issuedDay);
    }

    @GetMapping(path = "/book2")
    public void queryParamDto(
          BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }
}
