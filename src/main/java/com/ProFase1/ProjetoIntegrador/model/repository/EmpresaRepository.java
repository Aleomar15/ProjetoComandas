package com.ProFase1.ProjetoIntegrador.model.repository;

import com.ProFase1.ProjetoIntegrador.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
