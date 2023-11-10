package com.gestionEnvios.gestionEnvios.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "Envio")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)


    private int EnvioId;

    private int EnvioNumeroGuia;
    private String EnvioCliente;

    private int EnvioCedula;
    private String EnvioCiudadOrigen;
    private String EnvioCiudadDestino;
    private String EnvioDireccionDestino;

    private String EnvioNombrePersonsRecibe;
    private String EnvioNumeroPersonsRecibe;

    private int EnvioHoraEntrega;
    private String EnvioEstadoEnvio;

    private int EnvioValorEnvio;

    private String EnvioPaquete;


    public Envio(int envioId, int envioNumeroGuia, String envioCliente, int envioCedula, String envioCiudadOrigen,
                 String envioCiudadDestino, String envioDireccionDestino, String envioNombrePersonsRecibe,
                 String envioNumeroPersonsRecibe, int envioHoraEntrega, String envioEstadoEnvio, int envioValorEnvio,
                 String envioPaquete) {
        EnvioId = envioId;
        EnvioNumeroGuia = envioNumeroGuia;
        EnvioCliente = envioCliente;
        EnvioCedula = envioCedula;
        EnvioCiudadOrigen = envioCiudadOrigen;
        EnvioCiudadDestino = envioCiudadDestino;
        EnvioDireccionDestino = envioDireccionDestino;
        EnvioNombrePersonsRecibe = envioNombrePersonsRecibe;
        EnvioNumeroPersonsRecibe = envioNumeroPersonsRecibe;
        EnvioHoraEntrega = envioHoraEntrega;
        EnvioEstadoEnvio = envioEstadoEnvio;
        EnvioValorEnvio = envioValorEnvio;
        EnvioPaquete = envioPaquete;
    }

    public int getEnvioId() {
        return EnvioId;
    }

    public void setEnvioId(int envioId) {
        EnvioId = envioId;
    }

    public int getEnvioNumeroGuia() {
        return EnvioNumeroGuia;
    }

    public void setEnvioNumeroGuia(int envioNumeroGuia) {
        EnvioNumeroGuia = envioNumeroGuia;
    }

    public String getEnvioCliente() {
        return EnvioCliente;
    }

    public void setEnvioCliente(String envioCliente) {
        EnvioCliente = envioCliente;
    }

    public int getEnvioCedula() {
        return EnvioCedula;
    }

    public void setEnvioCedula(int envioCedula) {
        EnvioCedula = envioCedula;
    }

    public String getEnvioCiudadOrigen() {
        return EnvioCiudadOrigen;
    }

    public void setEnvioCiudadOrigen(String envioCiudadOrigen) {
        EnvioCiudadOrigen = envioCiudadOrigen;
    }

    public String getEnvioCiudadDestino() {
        return EnvioCiudadDestino;
    }

    public void setEnvioCiudadDestino(String envioCiudadDestino) {
        EnvioCiudadDestino = envioCiudadDestino;
    }

    public String getEnvioDireccionDestino() {
        return EnvioDireccionDestino;
    }

    public void setEnvioDireccionDestino(String envioDireccionDestino) {
        EnvioDireccionDestino = envioDireccionDestino;
    }

    public String getEnvioNombrePersonsRecibe() {
        return EnvioNombrePersonsRecibe;
    }

    public void setEnvioNombrePersonsRecibe(String envioNombrePersonsRecibe) {
        EnvioNombrePersonsRecibe = envioNombrePersonsRecibe;
    }

    public String getEnvioNumeroPersonsRecibe() {
        return EnvioNumeroPersonsRecibe;
    }

    public void setEnvioNumeroPersonsRecibe(String envioNumeroPersonsRecibe) {
        EnvioNumeroPersonsRecibe = envioNumeroPersonsRecibe;
    }

    public int getEnvioHoraEntrega() {
        return EnvioHoraEntrega;
    }

    public void setEnvioHoraEntrega(int envioHoraEntrega) {
        EnvioHoraEntrega = envioHoraEntrega;
    }

    public String getEnvioEstadoEnvio() {
        return EnvioEstadoEnvio;
    }

    public void setEnvioEstadoEnvio(String envioEstadoEnvio) {
        EnvioEstadoEnvio = envioEstadoEnvio;
    }

    public int getEnvioValorEnvio() {
        return EnvioValorEnvio;
    }

    public void setEnvioValorEnvio(int envioValorEnvio) {
        EnvioValorEnvio = envioValorEnvio;
    }

    public String getEnvioPaquete() {
        return EnvioPaquete;
    }

    public void setEnvioPaquete(String envioPaquete) {
        EnvioPaquete = envioPaquete;
    }
}
