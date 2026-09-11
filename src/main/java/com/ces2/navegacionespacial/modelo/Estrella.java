package com.ces2.navegacionespacial.modelo;

public class Estrella implements NaveEspacial {

    private final Nave nave;
    private String tipoEspectral;
    private double masasSolares;
    private int temperaturaKelvin;

    public Estrella(Nave nave, String tipoEspectral, double masasSolares, int temperaturaKelvin) {
        this.nave = nave;
        this.tipoEspectral = tipoEspectral;
        this.masasSolares = masasSolares;
        this.temperaturaKelvin = temperaturaKelvin;
    }

    public String brillar() {
        return "La estrella tipo " + tipoEspectral + " brilla a " + temperaturaKelvin
                + " K con " + masasSolares + " masas solares.";
    }

    @Override
    public String despegar(Nave nave) {
        return "[Estrella] " + nave.getNombre() + " usa la gravedad de la estrella tipo "
                + tipoEspectral + " como impulso para despegar a " + nave.getVelocidadMaxima()
                + " km/s (combustible " + nave.getNivelCombustible() + "%).";
    }

    @Override
    public String orbitar(Nave nave) {
        return "[Estrella] " + nave.getNombre() + " entra en orbita alrededor de la estrella de "
                + masasSolares + " masas solares antes de seguir hacia " + nave.getPlanetaDestino() + ".";
    }

    @Override
    public String aterrizarEnPlaneta(Nave nave) {
        return "[Estrella] " + nave.getNombre() + " (modelo " + nave.getModelo()
                + ") no puede posarse en la estrella (" + temperaturaKelvin + " K) y desvia su ruta hacia "
                + nave.getPlanetaDestino() + ".";
    }

    @Override
    public Nave getNave() {
        return nave;
    }

    @Override
    public String tipo() {
        return "Estrella";
    }
}
