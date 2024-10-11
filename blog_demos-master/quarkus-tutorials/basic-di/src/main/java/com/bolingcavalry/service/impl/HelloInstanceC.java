package com.bolingcavalry.service.impl;

import com.bolingcavalry.service.HelloInstance;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloInstanceC implements HelloInstance {
    @Override
    public String hello() {
        return this.getClass().getSimpleName();
    }
}