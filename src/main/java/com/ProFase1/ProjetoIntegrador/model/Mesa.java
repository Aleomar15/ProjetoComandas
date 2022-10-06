package com.ProFase1.ProjetoIntegrador.model;

import java.util.List;

public class Mesa {
    private int num_mesa;
    private List<Pedidos> pedidos;

    public int getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    
    

}
