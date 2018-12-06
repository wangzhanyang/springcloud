package com.gudao.serviceribbon.controller;

import com.gudao.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;



    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.service( name );
    }




}
