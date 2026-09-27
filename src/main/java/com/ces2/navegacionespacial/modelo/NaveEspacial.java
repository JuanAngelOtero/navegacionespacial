package com.ces2.navegacionespacial.modelo;

import java.util.List;

public interface NaveEspacial extends Despegable, Orbitable, Aterrizable {

    String getNombre();

    List<Nave> getNaves();

    String tipo();
}
