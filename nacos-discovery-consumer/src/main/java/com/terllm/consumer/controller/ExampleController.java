package com.terllm.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("example")
public class ExampleController {

    @Autowired
    private RestTemplate restTemplate;



    @RequestMapping("hello")
    public String example(){

        String res = restTemplate.getForObject("http://cusomer-server/example/hello",String.class);
        return res;

    }



}
