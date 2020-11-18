package com.example.demo.restapi;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatesApiController {
    private RatesApiService service;

    @GetMapping("/feed")
    public String all(Model model) {
        CurrencyBase base = service.findAll();
        model.addAttribute("base", base);
        return "rate";
    }
}
