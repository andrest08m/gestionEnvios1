package com.gestionEnvios.gestionEnvios.Controladores;

import com.gestionEnvios.gestionEnvios.DTO.ClienteDTO;
import com.gestionEnvios.gestionEnvios.Entidades.Cliente;
import com.gestionEnvios.gestionEnvios.servicio.ClienteSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
public class ClienteControler{


    @Autowired
    ClienteSer ClienteServicelmp;



    public ClienteControler(ClienteSer customerServicelmp) {
        this.ClienteServicelmp = customerServicelmp;
    }

    @GetMapping("")
    public List<Cliente> getAllBookings() {
        return this.ClienteServicelmp.getAllBookings();
    }


    @PostMapping("")
    public ResponseEntity<String> createCustomer(@RequestBody ClienteDTO cliente) {
        try {
            return this.ClienteServicelmp.crearCliente(cliente);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }


}
