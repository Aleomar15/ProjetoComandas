package com.ProFase1.ProjetoIntegrador.controller;

import com.ProFase1.ProjetoIntegrador.model.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ProFase1.ProjetoIntegrador.model.Funcionario;
import com.ProFase1.ProjetoIntegrador.model.repositories.FuncionarioRepository;
@Controller
public class FuncionarioController {
    @Autowired
    private EmpresaRepository er;
    @Autowired
    private FuncionarioRepository fr;

    @RequestMapping(value="/{id}/cadFunc", method = RequestMethod.GET )
    public String formFunc(){
        return "funcionario/CadastrarFunc";
    }
    @RequestMapping(value="/{id}/cadFunc", method = RequestMethod.POST )
    public String formFunc(Funcionario funcionario, @PathVariable("id") long id){
        er.findById(id);
        fr.save(funcionario);
        return "redirect:/{id}/cadFunc";

    }
}
