package com.gestionEnvios.gestionEnvios.Entidades;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable  = false , updatable = false)


    private  int CLiente_id;
    private int ClienteCedula;
    private int ClienteNumeroGuia;
    private String ClienteNombre;
    private String ClienteApellido;
    private int ClienteCelular;
    private String ClienteCorreo;
    private String ClienteDireccion;
    private String ClienteCiudad;


    @OneToOne
    @JsonIgnore
    @JoinColumn (name = "envio")
    private Envio envio;



    public Cliente(int CLiente_id, int clienteCedula, int clienteNumeroGuia,
                   String clienteNombre, String clienteApellido, int clienteCelular, String clienteCorreo,
                   String clienteDireccion, String clienteCiudad) {
        this.CLiente_id = CLiente_id;
        ClienteCedula = clienteCedula;
        ClienteNumeroGuia = clienteNumeroGuia;
        ClienteNombre = clienteNombre;
        ClienteApellido = clienteApellido;
        ClienteCelular = clienteCelular;
        ClienteCorreo = clienteCorreo;
        ClienteDireccion = clienteDireccion;
        ClienteCiudad = clienteCiudad;
    }

    public Cliente() {

    }

    public int getClienteCedula() {
        return ClienteCedula;
    }

    public void setClienteCedula(int clienteCedula) {
        ClienteCedula = clienteCedula;
    }

    public int getClienteNumeroGuia() {
        return ClienteNumeroGuia;
    }

    public void setClienteNumeroGuia(int clienteNumeroGuia) {
        ClienteNumeroGuia = clienteNumeroGuia;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        ClienteNombre = clienteNombre;
    }

    public String getClienteApellido() {
        return ClienteApellido;
    }

    public void setClienteApellido(String clienteApellido) {
        ClienteApellido = clienteApellido;
    }

    public int getClienteCelular() {
        return ClienteCelular;
    }

    public void setClienteCelular(int clienteCelular) {
        ClienteCelular = clienteCelular;
    }

    public String getClienteCorreo() {
        return ClienteCorreo;
    }

    public void setClienteCorreo(String clienteCorreo) {
        ClienteCorreo = clienteCorreo;
    }

    public String getClienteDireccion() {
        return ClienteDireccion;
    }

    public void setClienteDireccion(String clienteDireccion) {
        ClienteDireccion = clienteDireccion;
    }

    public String getClienteCiudad() {
        return ClienteCiudad;
    }

    public void setClienteCiudad(String clienteCiudad) {
        ClienteCiudad = clienteCiudad;
    }

    public int getCLiente_id() {
        return CLiente_id;
    }

    public void setCLiente_id(int CLiente_id) {
        this.CLiente_id = CLiente_id;
    }
}


