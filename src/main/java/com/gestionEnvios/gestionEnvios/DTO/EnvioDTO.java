package com.gestionEnvios.gestionEnvios.DTO;

public class EnvioDTO {
    private int EnvioDTONumeroGuia;
    private String EnvioDTOCliente;

    private String EnvioDTOCiudadOrigen;
    private String EnvioDTOCiudadDestino;
    private String EnvioDTODireccionDestino;

    private String EnvioDTONombrePersonsRecibe;
    private String EnvioDTONumeroPersonsRecibe;

    private int EnvioDTOHoraEntrega;
    private String EnvioDTOEstadoEnvio;

    private int EnvioDTOValorEnvio;

    private String EnvioDTOPaquete;

    public EnvioDTO() {
    }

    public EnvioDTO(int envioDTONumeroGuia, String envioDTOCliente, String envioDTOCiudadOrigen, String envioDTOCiudadDestino,
                    String envioDTODireccionDestino, String envioDTONombrePersonsRecibe, String envioDTONumeroPersonsRecibe,
                    int envioDTOHoraEntrega, String envioDTOEstadoEnvio, int envioDTOValorEnvio, String envioDTOPaquete) {
        EnvioDTONumeroGuia = envioDTONumeroGuia;
        EnvioDTOCliente = envioDTOCliente;
        EnvioDTOCiudadOrigen = envioDTOCiudadOrigen;
        EnvioDTOCiudadDestino = envioDTOCiudadDestino;
        EnvioDTODireccionDestino = envioDTODireccionDestino;
        EnvioDTONombrePersonsRecibe = envioDTONombrePersonsRecibe;
        EnvioDTONumeroPersonsRecibe = envioDTONumeroPersonsRecibe;
        EnvioDTOHoraEntrega = envioDTOHoraEntrega;
        EnvioDTOEstadoEnvio = envioDTOEstadoEnvio;
        EnvioDTOValorEnvio = envioDTOValorEnvio;
        EnvioDTOPaquete = envioDTOPaquete;
    }

    public int getEnvioDTONumeroGuia() {
        return EnvioDTONumeroGuia;
    }

    public void setEnvioDTONumeroGuia(int envioDTONumeroGuia) {
        EnvioDTONumeroGuia = envioDTONumeroGuia;
    }

    public String getEnvioDTOCliente() {
        return EnvioDTOCliente;
    }

    public void setEnvioDTOCliente(String envioDTOCliente) {
        EnvioDTOCliente = envioDTOCliente;
    }

    public String getEnvioDTOCiudadOrigen() {
        return EnvioDTOCiudadOrigen;
    }

    public void setEnvioDTOCiudadOrigen(String envioDTOCiudadOrigen) {
        EnvioDTOCiudadOrigen = envioDTOCiudadOrigen;
    }

    public String getEnvioDTOCiudadDestino() {
        return EnvioDTOCiudadDestino;
    }

    public void setEnvioDTOCiudadDestino(String envioDTOCiudadDestino) {
        EnvioDTOCiudadDestino = envioDTOCiudadDestino;
    }

    public String getEnvioDTODireccionDestino() {
        return EnvioDTODireccionDestino;
    }

    public void setEnvioDTODireccionDestino(String envioDTODireccionDestino) {
        EnvioDTODireccionDestino = envioDTODireccionDestino;
    }

    public String getEnvioDTONombrePersonsRecibe() {
        return EnvioDTONombrePersonsRecibe;
    }

    public void setEnvioDTONombrePersonsRecibe(String envioDTONombrePersonsRecibe) {
        EnvioDTONombrePersonsRecibe = envioDTONombrePersonsRecibe;
    }

    public String getEnvioDTONumeroPersonsRecibe() {
        return EnvioDTONumeroPersonsRecibe;
    }

    public void setEnvioDTONumeroPersonsRecibe(String envioDTONumeroPersonsRecibe) {
        EnvioDTONumeroPersonsRecibe = envioDTONumeroPersonsRecibe;
    }

    public int getEnvioDTOHoraEntrega() {
        return EnvioDTOHoraEntrega;
    }

    public void setEnvioDTOHoraEntrega(int envioDTOHoraEntrega) {
        EnvioDTOHoraEntrega = envioDTOHoraEntrega;
    }

    public String getEnvioDTOEstadoEnvio() {
        return EnvioDTOEstadoEnvio;
    }

    public void setEnvioDTOEstadoEnvio(String envioDTOEstadoEnvio) {
        EnvioDTOEstadoEnvio = envioDTOEstadoEnvio;
    }

    public int getEnvioDTOValorEnvio() {
        return EnvioDTOValorEnvio;
    }

    public void setEnvioDTOValorEnvio(int envioDTOValorEnvio) {
        EnvioDTOValorEnvio = envioDTOValorEnvio;
    }

    public String getEnvioDTOPaquete() {
        return EnvioDTOPaquete;
    }

    public void setEnvioDTOPaquete(String envioDTOPaquete) {
        EnvioDTOPaquete = envioDTOPaquete;
    }
}
