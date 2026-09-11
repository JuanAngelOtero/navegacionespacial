package com.ces2.navegacionespacial.modelo;

public class ResultadoNave {

    private String tipo;
    private String nombreNave;
    private String mensajeDespegar;
    private String mensajeOrbitar;
    private String mensajeAterrizar;

    public ResultadoNave(String tipo, String nombreNave, String mensajeDespegar,
                         String mensajeOrbitar, String mensajeAterrizar) {
        this.tipo = tipo;
        this.nombreNave = nombreNave;
        this.mensajeDespegar = mensajeDespegar;
        this.mensajeOrbitar = mensajeOrbitar;
        this.mensajeAterrizar = mensajeAterrizar;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public String getMensajeDespegar() {
        return mensajeDespegar;
    }

    public String getMensajeOrbitar() {
        return mensajeOrbitar;
    }

    public String getMensajeAterrizar() {
        return mensajeAterrizar;
    }
}
