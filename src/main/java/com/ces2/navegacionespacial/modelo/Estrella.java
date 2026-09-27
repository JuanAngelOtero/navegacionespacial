package com.ces2.navegacionespacial.modelo;

import java.util.List;

public class Estrella implements NaveEspacial {

    private final String nombre;
    private final List<Nave> naves;
    private final String tipoEspectral;
    private final double masasSolares;
    private final int temperaturaKelvin;

    public Estrella(String nombre, List<Nave> naves, String tipoEspectral,
                     double masasSolares, int temperaturaKelvin) {
        this.nombre = nombre;
        this.naves = naves;
        this.tipoEspectral = tipoEspectral;
        this.masasSolares = masasSolares;
        this.temperaturaKelvin = temperaturaKelvin;
    }

    public String brillar() {
        return "La estrella tipo " + tipoEspectral + " brilla a " + temperaturaKelvin
                + " K con " + masasSolares + " masas solares.";
    }

    @Override
    public String despegar(List<Nave> naves) {
        return "[Estrella] " + nombre + " impulsa el despegue de " + naves.size()
                + " nave(s) aprovechando su gravedad tipo " + tipoEspectral + ".";
    }

    @Override
    public String orbitar(List<Nave> naves) {
        return "[Estrella] " + nombre + " mantiene " + naves.size()
                + " nave(s) orbitando alrededor de sus " + masasSolares + " masas solares.";
    }

    @Override
    public String aterrizarEnPlaneta(List<Nave> naves) {
        return "[Estrella] " + nombre + " desvia hacia un planeta cercano a " + naves.size()
                + " nave(s), pues no pueden posarse en una superficie de " + temperaturaKelvin + " K.";
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
        return "Estrella";
    }
}
