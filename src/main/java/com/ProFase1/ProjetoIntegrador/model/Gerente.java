package com.ProFase1.ProjetoIntegrador.model;

import java.util.Set;

public class Gerente extends Funcionario{
    private Set<Cardapio> cardapios;

    public Set<Cardapio> getCardapios() {
        return cardapios;
    }

    public void setCardapios(Set<Cardapio> cardapios) {
        this.cardapios = cardapios;
    }
    
    
}
