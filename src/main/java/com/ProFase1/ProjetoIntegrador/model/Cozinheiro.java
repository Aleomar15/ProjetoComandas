package com.ProFase1.ProjetoIntegrador.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "cozinheiro")
public class Cozinheiro extends Funcionario{
}
