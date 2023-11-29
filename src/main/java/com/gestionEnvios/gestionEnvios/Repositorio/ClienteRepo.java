package com.gestionEnvios.gestionEnvios.Repositorio;

import com.gestionEnvios.gestionEnvios.Entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepo extends JpaRepository <Cliente,Integer> {

}
