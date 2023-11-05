package com.gestionEnvios.gestionEnvios.DTO;

public class EmpleadoDTO {

    private int cedula;
    private String Nombre;
    private String Apellido ;
    private int Celular;
    private String Correo;
    private String Direccion;
    private String Ciudad;

    private String Antiguedas;
    private String Rh;
    private String TipoEmpleado;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int cedula, String nombre, String apellido, int celular, String correo, String direccion,
                       String ciudad, String antiguedas, String rh, String tipoEmpleado) {
        this.cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Celular = celular;
        Correo = correo;
        Direccion = direccion;
        Ciudad = ciudad;
        Antiguedas = antiguedas;
        Rh = rh;
        TipoEmpleado = tipoEmpleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getAntiguedas() {
        return Antiguedas;
    }

    public void setAntiguedas(String antiguedas) {
        Antiguedas = antiguedas;
    }

    public String getRh() {
        return Rh;
    }

    public void setRh(String rh) {
        Rh = rh;
    }

    public String getTipoEmpleado() {
        return TipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        TipoEmpleado = tipoEmpleado;
    }
}
