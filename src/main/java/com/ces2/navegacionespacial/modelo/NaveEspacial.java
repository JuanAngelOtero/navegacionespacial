package com.ces2.navegacionespacial.modelo;

public interface NaveEspacial extends Despegable, Orbitable, Aterrizable {

    Nave getNave();

    String tipo();
}
