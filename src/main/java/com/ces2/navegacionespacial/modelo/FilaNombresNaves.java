package com.ces2.navegacionespacial.modelo;

import java.util.List;

public class FilaNombresNaves {

    private String tipo;
    private String nombre;
    private List<String> nombresNaves;

    public FilaNombresNaves(String tipo, String nombre, List<String> nombresNaves) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.nombresNaves = nombresNaves;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getNombresNaves() {
        return nombresNaves;
    }
}
