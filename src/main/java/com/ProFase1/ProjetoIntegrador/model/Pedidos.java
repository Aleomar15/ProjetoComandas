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
}
