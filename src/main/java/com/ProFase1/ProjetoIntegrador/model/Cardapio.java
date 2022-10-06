package com.ProFase1.ProjetoIntegrador.model;

import java.util.Set;

public class Cardapio {
    private  String prod_cardapio;
    private Set<ItensCardapio> itensCardapios;
    private Gerente gerente;

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

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }


}
