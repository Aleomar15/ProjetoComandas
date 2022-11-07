package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
@DiscriminatorValue(value = "garcon")
public class Garcon extends Funcionario{
    @OneToMany
    private List<Pedidos> pedidos;

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    
    

}
