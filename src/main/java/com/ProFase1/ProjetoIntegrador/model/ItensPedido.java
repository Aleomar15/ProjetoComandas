package com.ProFase1.ProjetoIntegrador.model;

import java.util.List;

public class ItensPedido {
    private short qtd_pedido;
    private String obs;
    private List<ItensCardapio> itensCardapios;

    public short getQtd_pedido() {
        return qtd_pedido;
    }

    public void setQtd_pedido(short qtd_pedido) {
        this.qtd_pedido = qtd_pedido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public List<ItensCardapio> getItensCardapios() {
        return itensCardapios;
    }

    public void setItensCardapios(List<ItensCardapio> itensCardapios) {
        this.itensCardapios = itensCardapios;
    }
    
}
