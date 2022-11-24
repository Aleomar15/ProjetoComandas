package com.ProFase1.ProjetoIntegrador.model.repositories;

import com.ProFase1.ProjetoIntegrador.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
}
