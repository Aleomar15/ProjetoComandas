package com.ProFase1.ProjetoIntegrador.controller;

import com.ProFase1.ProjetoIntegrador.model.ItensCardapio;
import com.ProFase1.ProjetoIntegrador.model.ItensPedido;
import com.ProFase1.ProjetoIntegrador.model.repositories.ItensCardapioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItensController {
   private ItensCardapioRepository ic;
   @RequestMapping(value = "/itens",method = RequestMethod.POST)
   public ItensCardapio cadItem(ItensCardapio itensCardapio){

    return ic.save(itensCardapio);
   }
}
