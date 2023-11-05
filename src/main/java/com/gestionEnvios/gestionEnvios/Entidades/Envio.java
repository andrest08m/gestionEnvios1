package com.gestionEnvios.gestionEnvios.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "Envio")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)

    private int NumeroGuia;
    private String Cliente;

    private String CiudadOrigen;
    private String CiudadDestino;
    private String DireccionDestino;

    private String NombrePersonsRecibe;
    private String NumeroPersonsRecibe;

    private int HoraEntrega;
    private String EstadoEnvio;

    private int ValorEnvio;

    private String Paquete;

    public Envio(int numeroGuia, String cliente, String ciudadOrigen, String ciudadDestino, String direccionDestino,
                 String nombrePersonsRecibe, String numeroPersonsRecibe, int horaEntrega, String estadoEnvio,
                 int valorEnvio, String paquete) {
        NumeroGuia = numeroGuia;
        Cliente = cliente;
        CiudadOrigen = ciudadOrigen;
        CiudadDestino = ciudadDestino;
        DireccionDestino = direccionDestino;
        NombrePersonsRecibe = nombrePersonsRecibe;
        NumeroPersonsRecibe = numeroPersonsRecibe;
        HoraEntrega = horaEntrega;
        EstadoEnvio = estadoEnvio;
        ValorEnvio = valorEnvio;
        Paquete = paquete;
    }

    public int getNumeroGuia() {
        return NumeroGuia;
    }

    public void setNumeroGuia(int numeroGuia) {
        NumeroGuia = numeroGuia;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        CiudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        CiudadDestino = ciudadDestino;
    }

    public String getDireccionDestino() {
        return DireccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        DireccionDestino = direccionDestino;
    }

    public String getNombrePersonsRecibe() {
        return NombrePersonsRecibe;
    }

    public void setNombrePersonsRecibe(String nombrePersonsRecibe) {
        NombrePersonsRecibe = nombrePersonsRecibe;
    }

    public String getNumeroPersonsRecibe() {
        return NumeroPersonsRecibe;
    }

    public void setNumeroPersonsRecibe(String numeroPersonsRecibe) {
        NumeroPersonsRecibe = numeroPersonsRecibe;
    }

    public int getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(int horaEntrega) {
        HoraEntrega = horaEntrega;
    }

    public String getEstadoEnvio() {
        return EstadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        EstadoEnvio = estadoEnvio;
    }

    public int getValorEnvio() {
        return ValorEnvio;
    }

    public void setValorEnvio(int valorEnvio) {
        ValorEnvio = valorEnvio;
    }

    public String getPaquete() {
        return Paquete;
    }

    public void setPaquete(String paquete) {
        Paquete = paquete;
    }
}
