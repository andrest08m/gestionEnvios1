package com.gestionEnvios.gestionEnvios.Repositorio;

import com.gestionEnvios.gestionEnvios.Entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository <Cliente,Long> {
}
