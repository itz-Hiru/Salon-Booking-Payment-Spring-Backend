package com.hiru.salon.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String HomeControllerHelper() {
        return "Payment microservice for salon booking system started successfully";
    }
}
