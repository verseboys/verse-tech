package com.bolingcavalry.customizebeanfactorypostprocessor.controller;

import com.bolingcavalry.customizebeanfactorypostprocessor.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    CalculateService calculateService;


    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable("a") int a, @PathVariable("b") int b){
        return "add result : " + calculateService.add(a, b) + ", from [" + calculateService.getServiceDesc() + "]";
    }
}
