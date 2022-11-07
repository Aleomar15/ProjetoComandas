package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  String prod_cardapio;
    @OneToMany
    private Set<ItensCardapio> itensCardapios;



    public String getProd_cardapio() {
        return prod_cardapio;
    }

    public void setProd_cardapio(String prod_cardapio) {
        this.prod_cardapio = prod_cardapio;
    }

    public Set<ItensCardapio> getItensCardapios() {
        return itensCardapios;
    }

    public void setItensCardapios(Set<ItensCardapio> itensCardapios) {
        this.itensCardapios = itensCardapios;
    }




}
