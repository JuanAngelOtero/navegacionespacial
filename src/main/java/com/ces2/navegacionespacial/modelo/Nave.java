package com.ces2.navegacionespacial.modelo;

public class Nave {

    private String nombre;
    private String modelo;
    private int velocidadMaxima;
    private int nivelCombustible;
    private String planetaDestino;

    public Nave(String nombre, String modelo, int velocidadMaxima,
                int nivelCombustible, String planetaDestino) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.nivelCombustible = nivelCombustible;
        this.planetaDestino = planetaDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public String getPlanetaDestino() {
        return planetaDestino;
    }

    public String ficha() {
        return "Nave " + nombre + " (modelo " + modelo + "), velocidad maxima "
                + velocidadMaxima + " km/s, combustible " + nivelCombustible
                + "%, destino " + planetaDestino;
    }
}
