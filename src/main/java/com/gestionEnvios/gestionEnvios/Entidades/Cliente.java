package com.gestionEnvios.gestionEnvios.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)


    private int Cedula;
    private String Nombre;
    private String Apellido ;
    private int Celular;
    private String Correo;
    private String Direccion;
    private String Ciudad;

    public Cliente(String nombre,int cedula,String apellido, int celular, String correo, String direccion, String ciudad) {
        Nombre = nombre;
        Apellido = apellido;
        Celular = celular;
        Correo = correo;
        Direccion = direccion;
        Ciudad = ciudad;
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

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }
}
