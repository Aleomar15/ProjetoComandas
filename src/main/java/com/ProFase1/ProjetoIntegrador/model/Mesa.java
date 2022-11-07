package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.*;
import java.util.List;
@Entity

public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num_mesa;
    @OneToMany
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
