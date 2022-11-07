package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.*;

@Entity
public class ItensCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float preco;
    private String descricao;
    @ManyToOne
    private Cardapio cardapio;
    @ManyToOne
    private ItensPedido itensPedido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ItensPedido getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ItensPedido itensPedido) {
        this.itensPedido = itensPedido;
    }
    
    
}
