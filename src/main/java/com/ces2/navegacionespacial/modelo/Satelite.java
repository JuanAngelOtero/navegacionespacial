package com.ces2.navegacionespacial.modelo;

public class Satelite implements NaveEspacial {

    private final Nave nave;
    private String operador;
    private int altitudOrbita;
    private double frecuenciaGhz;

    public Satelite(Nave nave, String operador, int altitudOrbita, double frecuenciaGhz) {
        this.nave = nave;
        this.operador = operador;
        this.altitudOrbita = altitudOrbita;
        this.frecuenciaGhz = frecuenciaGhz;
    }

    public String transmitirSenal() {
        return "El satelite de " + operador + " transmite en " + frecuenciaGhz
                + " GHz desde " + altitudOrbita + " km de altura.";
    }

    @Override
    public String despegar(Nave nave) {
        return "[Satelite] " + nave.getNombre() + " es puesto en orbita por un cohete de "
                + operador + " a " + nave.getVelocidadMaxima() + " km/s (combustible "
                + nave.getNivelCombustible() + "%).";
    }

    @Override
    public String orbitar(Nave nave) {
        return "[Satelite] " + nave.getNombre() + " orbita " + nave.getPlanetaDestino()
                + " a " + altitudOrbita + " km y envia datos en " + frecuenciaGhz + " GHz.";
    }

    @Override
    public String aterrizarEnPlaneta(Nave nave) {
        return "[Satelite] " + nave.getNombre() + " (modelo " + nave.getModelo()
                + ") reingresa y aterriza de forma controlada en " + nave.getPlanetaDestino()
                + " para ser recuperado por " + operador + ".";
    }

    @Override
    public Nave getNave() {
        return nave;
    }

    @Override
    public String tipo() {
        return "Satelite";
    }
}
