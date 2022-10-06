package com.ProFase1.ProjetoIntegrador.model;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;

public class Pedidos {
    private int id_pedido;
    private boolean disp;
    private Calendar data;
    private Time horario_ini;
    private Time horario_fim;
    private List<ItensPedido> itensPedidos;
    private Mesa mesa;
    private Garcon garcon;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public boolean isDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Time getHorario_ini() {
        return horario_ini;
    }

    public void setHorario_ini(Time horario_ini) {
        this.horario_ini = horario_ini;
    }

    public Time getHorario_fim() {
        return horario_fim;
    }

    public void setHorario_fim(Time horario_fim) {
        this.horario_fim = horario_fim;
    }

    public List<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItensPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }
    
    
}
