package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
            ){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }
}
