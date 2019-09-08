package com.terllm.provider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleController {

    @RequestMapping("hello")
    public String example(){


        return "hello world !!!";

    }







}
