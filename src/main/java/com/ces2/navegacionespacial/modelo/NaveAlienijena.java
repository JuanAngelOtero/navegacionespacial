package com.ces2.navegacionespacial.modelo;

public class NaveAlienijena implements NaveEspacial {

    private final Nave nave;
    private String galaxiaOrigen;
    private String tipoTecnologia;
    private int nivelSigilo;

    public NaveAlienijena(Nave nave, String galaxiaOrigen, String tipoTecnologia, int nivelSigilo) {
        this.nave = nave;
        this.galaxiaOrigen = galaxiaOrigen;
        this.tipoTecnologia = tipoTecnologia;
        this.nivelSigilo = nivelSigilo;
    }

    public String camuflar() {
        return "La nave alienigena de " + galaxiaOrigen + " activa camuflaje al "
                + nivelSigilo + "% usando tecnologia " + tipoTecnologia + ".";
    }

    @Override
    public String despegar(Nave nave) {
        return "[NaveAlienijena] " + nave.getNombre() + " despega con antigravedad "
                + tipoTecnologia + " desde la galaxia " + galaxiaOrigen
                + " a " + nave.getVelocidadMaxima() + " km/s (combustible "
                + nave.getNivelCombustible() + "%).";
    }

    @Override
    public String orbitar(Nave nave) {
        return "[NaveAlienijena] " + nave.getNombre() + " orbita " + nave.getPlanetaDestino()
                + " en modo sigilo al " + nivelSigilo + "% sin ser detectada.";
    }

    @Override
    public String aterrizarEnPlaneta(Nave nave) {
        return "[NaveAlienijena] " + nave.getNombre() + " (modelo " + nave.getModelo()
                + ") aterriza en " + nave.getPlanetaDestino()
                + " y estudia la superficie con sensores de " + galaxiaOrigen + ".";
    }

    @Override
    public Nave getNave() {
        return nave;
    }

    @Override
    public String tipo() {
        return "NaveAlienijena";
    }
}
