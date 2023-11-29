package com.gestionEnvios.gestionEnvios.servicio;
import com.gestionEnvios.gestionEnvios.DTO.ClienteDTO;
import com.gestionEnvios.gestionEnvios.Entidades.Cliente;
import com.gestionEnvios.gestionEnvios.Entidades.Envio;
import com.gestionEnvios.gestionEnvios.Repositorio.ClienteRepo;
import com.gestionEnvios.gestionEnvios.Repositorio.EnvioReepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteSer {

    private final ClienteRepo clienteRepo;
    private final EnvioReepo envioRepo;

    @Autowired
    public ClienteSer(ClienteRepo clienteRepo, EnvioReepo envioRepo) {
        this.clienteRepo = clienteRepo;
        this.envioRepo = envioRepo;
    }

    public List<Cliente> getAllClientes() {
        return clienteRepo.findAll();
    }

    public ResponseEntity<String> crearCliente(ClienteDTO clienteDTO) {
        Cliente cliente = mapFromDTO(clienteDTO);
        List<Envio> envios = envioRepo.findAll();

        for (Envio envio : envios) {
            if (envio.getEnvioNumeroGuia() == cliente.getClienteCedula()) {
                cliente.setClienteNumeroGuia(envio.getEnvioId());
            }
        }

        clienteRepo.save(cliente);

        return ResponseEntity.status(201).body("Cliente creado");
    }

    public ClienteDTO mapToDTO(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setClienteApellidoDTO(cliente.getClienteApellido());
        clienteDTO.setClienteCelularDTO(cliente.getClienteCelular());
        clienteDTO.setClienteCiudadDTO(cliente.getClienteCiudad());
        clienteDTO.setClienteCorreoDTO(cliente.getClienteCorreo());
        clienteDTO.setClienteDireccionDTO(cliente.getClienteDireccion());
        clienteDTO.setClienteNombreDTO(cliente.getClienteNombre());

        return clienteDTO;
    }

    public Cliente mapFromDTO(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();

        cliente.setClienteApellido(clienteDTO.getClienteApellidoDTO());
        cliente.setClienteCelular(clienteDTO.getClienteCelularDTO());
        cliente.setClienteCiudad(clienteDTO.getClienteCiudadDTO());
        cliente.setClienteCorreo(clienteDTO.getClienteCorreoDTO());
        cliente.setClienteDireccion(clienteDTO.getClienteDireccionDTO());
        cliente.setClienteNombre(clienteDTO.getClienteNombreDTO());

        return cliente;
    }


}
