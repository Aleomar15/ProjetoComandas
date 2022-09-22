package com.ProFase1.ProjetoIntegrador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class indexController {
    @GetMapping("/teste")
    public String index(){
        return "index";
    }
}
