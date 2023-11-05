package com.gestionEnvios.gestionEnvios.DTO;

public class PaqueteDTO {
    private  int  identificacionPaquete;
    private String tipoPaquete;
    private int peso;
    private int ValorDeclarado;

    public PaqueteDTO(int identificacionPaquete, String tipoPaquete, int peso, int valorDeclarado) {
        this.identificacionPaquete = identificacionPaquete;
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        ValorDeclarado = valorDeclarado;
    }

    public int getIdentificacionPaquete() {
        return identificacionPaquete;
    }

    public void setIdentificacionPaquete(int identificacionPaquete) {
        this.identificacionPaquete = identificacionPaquete;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getValorDeclarado() {
        return ValorDeclarado;
    }

    public void setValorDeclarado(int valorDeclarado) {
        ValorDeclarado = valorDeclarado;
    }
}
