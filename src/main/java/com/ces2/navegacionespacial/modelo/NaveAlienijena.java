package com.ces2.navegacionespacial.modelo;

import java.util.List;

public class NaveAlienijena implements NaveEspacial {

    private final String nombre;
    private final List<Nave> naves;
    private final String galaxiaOrigen;
    private final String tipoTecnologia;
    private final int nivelSigilo;

    public NaveAlienijena(String nombre, List<Nave> naves, String galaxiaOrigen,
                           String tipoTecnologia, int nivelSigilo) {
        this.nombre = nombre;
        this.naves = naves;
        this.galaxiaOrigen = galaxiaOrigen;
        this.tipoTecnologia = tipoTecnologia;
        this.nivelSigilo = nivelSigilo;
    }

    public String camuflar() {
        return "La nave alienigena de " + galaxiaOrigen + " activa camuflaje al "
                + nivelSigilo + "% usando tecnologia " + tipoTecnologia + ".";
    }

    @Override
    public String despegar(List<Nave> naves) {
        return "[NaveAlienijena] " + nombre + " prepara el despegue de " + naves.size()
                + " nave(s) con tecnologia " + tipoTecnologia + " desde la galaxia " + galaxiaOrigen + ".";
    }

    @Override
    public String orbitar(List<Nave> naves) {
        return "[NaveAlienijena] " + nombre + " pone en orbita " + naves.size()
                + " nave(s) en modo sigilo al " + nivelSigilo + "%.";
    }

    @Override
    public String aterrizarEnPlaneta(List<Nave> naves) {
        return "[NaveAlienijena] " + nombre + " coordina el aterrizaje de " + naves.size()
                + " nave(s) usando sensores de " + galaxiaOrigen + ".";
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
        return "NaveAlienijena";
    }
}
