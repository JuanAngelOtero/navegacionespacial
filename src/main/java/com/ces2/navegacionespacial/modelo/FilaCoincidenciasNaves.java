package com.ces2.navegacionespacial.modelo;

public class FilaCoincidenciasNaves {

    private String tipo;
    private String nombre;
    private boolean algunaNaveVeloz;
    private boolean algunaNaveConPocoCombustible;
    private boolean ningunaNaveConCombustibleCritico;

    public FilaCoincidenciasNaves(String tipo, String nombre, boolean algunaNaveVeloz,
                                   boolean algunaNaveConPocoCombustible,
                                   boolean ningunaNaveConCombustibleCritico) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.algunaNaveVeloz = algunaNaveVeloz;
        this.algunaNaveConPocoCombustible = algunaNaveConPocoCombustible;
        this.ningunaNaveConCombustibleCritico = ningunaNaveConCombustibleCritico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAlgunaNaveVeloz() {
        return algunaNaveVeloz;
    }

    public boolean isAlgunaNaveConPocoCombustible() {
        return algunaNaveConPocoCombustible;
    }

    public boolean isNingunaNaveConCombustibleCritico() {
        return ningunaNaveConCombustibleCritico;
    }
}
