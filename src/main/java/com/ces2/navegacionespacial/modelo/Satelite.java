package com.ces2.navegacionespacial.modelo;

import java.util.List;

public class Satelite implements NaveEspacial {

    private final String nombre;
    private final List<Nave> naves;
    private final String operador;
    private final int altitudOrbita;
    private final double frecuenciaGhz;

    public Satelite(String nombre, List<Nave> naves, String operador,
                     int altitudOrbita, double frecuenciaGhz) {
        this.nombre = nombre;
        this.naves = naves;
        this.operador = operador;
        this.altitudOrbita = altitudOrbita;
        this.frecuenciaGhz = frecuenciaGhz;
    }

    public String transmitirSenal() {
        return "El satelite de " + operador + " transmite en " + frecuenciaGhz
                + " GHz desde " + altitudOrbita + " km de altura.";
    }

    @Override
    public String despegar(List<Nave> naves) {
        return "[Satelite] " + nombre + " pone en orbita a " + naves.size()
                + " nave(s) con un cohete de " + operador + ".";
    }

    @Override
    public String orbitar(List<Nave> naves) {
        return "[Satelite] " + nombre + " mantiene " + naves.size()
                + " nave(s) orbitando a " + altitudOrbita + " km, transmitiendo en " + frecuenciaGhz + " GHz.";
    }

    @Override
    public String aterrizarEnPlaneta(List<Nave> naves) {
        return "[Satelite] " + nombre + " guia el reingreso de " + naves.size()
                + " nave(s) para " + operador + ".";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Nave> getNaves() {
        return naves;
    }

    @Override
    public String tipo() {
        return "Satelite";
    }
}
