package com.gestionEnvios.gestionEnvios.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)

    private int Empleadocedula;
    private String EmpleadoNombre;
    private String EmpleadoApellido ;
    private int EmpleadoCelular;
    private String EmpleadoCorreo;
    private String EmpleadoDireccion;
    private String EmpleadoCiudad;

    private String EmpleadoAntigueda;
    private String Rh;
    private String TipoEmpleado;

    public Empleado(int empleadocedula, String empleadoNombre, String empleadoApellido, int empleadoCelular,
                    String empleadoCorreo, String empleadoDireccion, String empleadoCiudad, String empleadoAntigueda,
                    String rh, String tipoEmpleado) {
        Empleadocedula = empleadocedula;
        EmpleadoNombre = empleadoNombre;
        EmpleadoApellido = empleadoApellido;
        EmpleadoCelular = empleadoCelular;
        EmpleadoCorreo = empleadoCorreo;
        EmpleadoDireccion = empleadoDireccion;
        EmpleadoCiudad = empleadoCiudad;
        EmpleadoAntigueda = empleadoAntigueda;
        Rh = rh;
        TipoEmpleado = tipoEmpleado;
    }

    public int getEmpleadocedula() {
        return Empleadocedula;
    }

    public void setEmpleadocedula(int empleadocedula) {
        Empleadocedula = empleadocedula;
    }

    public String getEmpleadoNombre() {
        return EmpleadoNombre;
    }

    public void setEmpleadoNombre(String empleadoNombre) {
        EmpleadoNombre = empleadoNombre;
    }

    public String getEmpleadoApellido() {
        return EmpleadoApellido;
    }

    public void setEmpleadoApellido(String empleadoApellido) {
        EmpleadoApellido = empleadoApellido;
    }

    public int getEmpleadoCelular() {
        return EmpleadoCelular;
    }

    public void setEmpleadoCelular(int empleadoCelular) {
        EmpleadoCelular = empleadoCelular;
    }

    public String getEmpleadoCorreo() {
        return EmpleadoCorreo;
    }

    public void setEmpleadoCorreo(String empleadoCorreo) {
        EmpleadoCorreo = empleadoCorreo;
    }

    public String getEmpleadoDireccion() {
        return EmpleadoDireccion;
    }

    public void setEmpleadoDireccion(String empleadoDireccion) {
        EmpleadoDireccion = empleadoDireccion;
    }

    public String getEmpleadoCiudad() {
        return EmpleadoCiudad;
    }

    public void setEmpleadoCiudad(String empleadoCiudad) {
        EmpleadoCiudad = empleadoCiudad;
    }

    public String getEmpleadoAntigueda() {
        return EmpleadoAntigueda;
    }

    public void setEmpleadoAntigueda(String empleadoAntigueda) {
        EmpleadoAntigueda = empleadoAntigueda;
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
