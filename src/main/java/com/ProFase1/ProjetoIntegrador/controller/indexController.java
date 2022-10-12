package com.ProFase1.ProjetoIntegrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class indexController {
    @GetMapping("/teste")
    public String index(){
        return "index";
    }
}
