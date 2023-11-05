package com.gestionEnvios.gestionEnvios.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)

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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Empleado(String nombre, String apellido, int celular, String correo, String direccion, String ciudad,
                    String antiguedas, String rh, String tipoEmpleado, int cedula) {
        Nombre = nombre;
        Apellido = apellido;
        Celular = celular;
        Correo = correo;
        Direccion = direccion;
        Ciudad = ciudad;
        Antiguedas = antiguedas;
        Rh = rh;
        TipoEmpleado = tipoEmpleado;
        this.cedula = cedula;



    }
}
