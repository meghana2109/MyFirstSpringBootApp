package com.myorg.microservices.SampleSpringBootService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @GetMapping
    public String returnValue(){
        return "Hi! welcome to my spring boot Application";
    }

}
