package com.gestionEnvios.gestionEnvios.Repositorio;

import com.gestionEnvios.gestionEnvios.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepo extends JpaRepository <Empleado, Long> {
}
