package com.gestionEnvios.gestionEnvios.DTO;

public class EmpleadoDTO {

    private int EmpleadoDTOcedula;
    private String EmpleadoDTONombre;
    private String EmpleadoDTOApellido;
    private int EmpleadoDTOCelular;
    private String EmpleadoDTOCorreo;
    private String EmpleadoDTODireccion;
    private String EmpleadoDTOCiudad;

    private String Antiguedas;
    private String Rh;
    private String TipoEmpleado;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int empleadoDTOcedula, String empleadoDTONombre, String empleadoDTOApellido,
                       int empleadoDTOCelular, String empleadoDTOCorreo, String empleadoDTODireccion,
                       String empleadoDTOCiudad, String antiguedas, String rh, String tipoEmpleado) {
        EmpleadoDTOcedula = empleadoDTOcedula;
        EmpleadoDTONombre = empleadoDTONombre;
        EmpleadoDTOApellido = empleadoDTOApellido;
        EmpleadoDTOCelular = empleadoDTOCelular;
        EmpleadoDTOCorreo = empleadoDTOCorreo;
        EmpleadoDTODireccion = empleadoDTODireccion;
        EmpleadoDTOCiudad = empleadoDTOCiudad;
        Antiguedas = antiguedas;
        Rh = rh;
        TipoEmpleado = tipoEmpleado;
    }

    public int getEmpleadoDTOcedula() {
        return EmpleadoDTOcedula;
    }

    public void setEmpleadoDTOcedula(int empleadoDTOcedula) {
        EmpleadoDTOcedula = empleadoDTOcedula;
    }

    public String getEmpleadoDTONombre() {
        return EmpleadoDTONombre;
    }

    public void setEmpleadoDTONombre(String empleadoDTONombre) {
        EmpleadoDTONombre = empleadoDTONombre;
    }

    public String getEmpleadoDTOApellido() {
        return EmpleadoDTOApellido;
    }

    public void setEmpleadoDTOApellido(String empleadoDTOApellido) {
        EmpleadoDTOApellido = empleadoDTOApellido;
    }

    public int getEmpleadoDTOCelular() {
        return EmpleadoDTOCelular;
    }

    public void setEmpleadoDTOCelular(int empleadoDTOCelular) {
        EmpleadoDTOCelular = empleadoDTOCelular;
    }

    public String getEmpleadoDTOCorreo() {
        return EmpleadoDTOCorreo;
    }

    public void setEmpleadoDTOCorreo(String empleadoDTOCorreo) {
        EmpleadoDTOCorreo = empleadoDTOCorreo;
    }

    public String getEmpleadoDTODireccion() {
        return EmpleadoDTODireccion;
    }

    public void setEmpleadoDTODireccion(String empleadoDTODireccion) {
        EmpleadoDTODireccion = empleadoDTODireccion;
    }

    public String getEmpleadoDTOCiudad() {
        return EmpleadoDTOCiudad;
    }

    public void setEmpleadoDTOCiudad(String empleadoDTOCiudad) {
        EmpleadoDTOCiudad = empleadoDTOCiudad;
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
