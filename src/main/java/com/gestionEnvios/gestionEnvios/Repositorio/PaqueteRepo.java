package com.gestionEnvios.gestionEnvios.Repositorio;

import com.gestionEnvios.gestionEnvios.Entidades.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaqueteRepo extends JpaRepository<Paquete,Long> {
}
