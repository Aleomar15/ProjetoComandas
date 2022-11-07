package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class ItensPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private short qtd_pedido;
    private String obs;
    @OneToMany
    private List<ItensCardapio> itensCardapios;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
