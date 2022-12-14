package com.ProFase1.ProjetoIntegrador.controller;

import com.ProFase1.ProjetoIntegrador.model.Empresa;
import com.ProFase1.ProjetoIntegrador.model.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpresaController {
    @Autowired
    private EmpresaRepository emp;
    @RequestMapping(value = "/cadEmpresa", method = RequestMethod.GET)
    public String formEmp(){
        return "empresa/RegistrarEmpresa";
    }
    @RequestMapping(value = "/cadEmpresa", method = RequestMethod.POST)
    public String formEmp(@RequestBody Empresa empresa){
        emp.save(empresa);
        return "redirect:/cadEmpresa";
    }

}
