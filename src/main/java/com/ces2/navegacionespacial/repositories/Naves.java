package com.ces2.navegacionespacial.repositories;

import com.ces2.navegacionespacial.modelo.Estrella;
import com.ces2.navegacionespacial.modelo.Nave;
import com.ces2.navegacionespacial.modelo.NaveAlienijena;
import com.ces2.navegacionespacial.modelo.NaveEspacial;
import com.ces2.navegacionespacial.modelo.Satelite;

import java.util.Arrays;
import java.util.List;

public class Naves {

    private static final List<Nave> POOL = List.of(
            new Nave("Vector-1", "Explorador", 1200, 80, "Marte"),
            new Nave("Vector-2", "Carguero", 900, 60, "Jupiter"),
            new Nave("Vector-3", "Sonda", 3200, 45, "Venus"),
            new Nave("Vector-4", "Crucero", 2500, 90, "Titan"),
            new Nave("Vector-5", "Interceptor", 4200, 30, "Europa")
    );

    public static final List<NaveEspacial> lista = Arrays.asList(
            new NaveAlienijena("Zeta-1", POOL.subList(0, 0), "Andromeda", "antimateria", 95),
            new NaveAlienijena("Zeta-2", POOL.subList(0, 1), "Andromeda", "plasma", 80),
            new NaveAlienijena("Zeta-3", POOL.subList(0, 2), "Via Lactea", "curvatura", 70),
            new NaveAlienijena("Zeta-4", POOL.subList(0, 3), "Nebulosa de Orion", "ionica", 60),

            new Satelite("Orbita-1", POOL.subList(0, 2), "NASA", 550, 12.5),
            new Satelite("Orbita-2", POOL.subList(0, 3), "ESA", 35786, 4.2),
            new Satelite("Orbita-3", POOL.subList(0, 4), "NOAA", 830, 8.1),
            new Satelite("Orbita-4", POOL.subList(0, 5), "SpaceX", 400, 20.0),

            new Estrella("Sol-A", POOL.subList(0, 0), "G", 1.0, 5778),
            new Estrella("Sol-B", POOL.subList(0, 1), "M", 0.12, 3042),
            new Estrella("Sol-C", POOL.subList(0, 4), "A", 2.1, 9600),
            new Estrella("Sol-D", POOL.subList(0, 5), "K", 0.8, 4500)
    );
}
