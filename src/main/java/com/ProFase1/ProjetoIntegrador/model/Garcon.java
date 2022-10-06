package com.ProFase1.ProjetoIntegrador.model;

import java.util.List;

public class Garcon extends Funcionario{
    private List<Pedidos> pedidos;

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    
    

}
