package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
@DiscriminatorValue(value = "gerente")
public class Gerente extends Funcionario{
    @OneToMany
    private Set<Cardapio> cardapios;

    public Set<Cardapio> getCardapios() {
        return cardapios;
    }

    public void setCardapios(Set<Cardapio> cardapios) {
        this.cardapios = cardapios;
    }
    
    
}
