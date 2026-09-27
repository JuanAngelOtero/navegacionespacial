package com.ces2.navegacionespacial.modelo;

public class FilaMaximaVelocidad {

    private String tipo;
    private String nombre;
    private String naveConMayorVelocidad;

    public FilaMaximaVelocidad(String tipo, String nombre, String naveConMayorVelocidad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.naveConMayorVelocidad = naveConMayorVelocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNaveConMayorVelocidad() {
        return naveConMayorVelocidad;
    }
}
