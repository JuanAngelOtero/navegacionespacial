package com.ces2.navegacionespacial.controlador;

import com.ces2.navegacionespacial.modelo.EstadisticaNaves;
import com.ces2.navegacionespacial.modelo.FilaCoincidenciasNaves;
import com.ces2.navegacionespacial.modelo.FilaMaximaVelocidad;
import com.ces2.navegacionespacial.modelo.FilaNombresNaves;
import com.ces2.navegacionespacial.modelo.Nave;
import com.ces2.navegacionespacial.modelo.NaveEspacial;
import com.ces2.navegacionespacial.repositories.Naves;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class NavegacionEspacialControlador {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("peticion1")
    public String peticion1(Model model) {

        String nombres = Naves.lista.stream()
                .map(NaveEspacial::getNombre)
                .collect(Collectors.joining(", "));

        model.addAttribute("nombres", nombres);

        return "vista1";
    }

    @GetMapping("peticion2")
    public String peticion2(Model model) {

        List<EstadisticaNaves> estadisticas = new ArrayList<>();

        for (NaveEspacial naveEspacial : Naves.lista) {

            IntSummaryStatistics stats = naveEspacial.getNaves().stream()
                    .collect(Collectors.summarizingInt(Nave::getVelocidadMaxima));

            estadisticas.add(new EstadisticaNaves(
                    naveEspacial.tipo(),
                    naveEspacial.getNombre(),
                    stats.getCount(),
                    (int) stats.getSum(),
                    stats.getAverage(),
                    stats.getCount() == 0 ? 0 : stats.getMin(),
                    stats.getCount() == 0 ? 0 : stats.getMax()));
        }

        model.addAttribute("estadisticas", estadisticas);

        return "vista2";
    }

    @GetMapping("peticion3")
    public String peticion3(Model model) {

        List<FilaNombresNaves> filas = new ArrayList<>();

        for (NaveEspacial naveEspacial : Naves.lista) {

            List<String> nombresNaves = naveEspacial.getNaves().stream()
                    .map(Nave::getNombre)
                    .collect(Collectors.toList());

            filas.add(new FilaNombresNaves(naveEspacial.tipo(), naveEspacial.getNombre(), nombresNaves));
        }

        model.addAttribute("filas", filas);

        return "vista3";
    }

    @GetMapping("peticion4")
    public String peticion4(Model model) {

        List<FilaCoincidenciasNaves> filas = new ArrayList<>();

        for (NaveEspacial naveEspacial : Naves.lista) {

            boolean algunaNaveVeloz = naveEspacial.getNaves().stream()
                    .anyMatch(nave -> nave.getVelocidadMaxima() > 3000);

            boolean algunaNaveConPocoCombustible = naveEspacial.getNaves().stream()
                    .anyMatch(nave -> nave.getNivelCombustible() < 50);

            boolean ningunaNaveConCombustibleCritico = naveEspacial.getNaves().stream()
                    .noneMatch(nave -> nave.getNivelCombustible() < 20);

            filas.add(new FilaCoincidenciasNaves(
                    naveEspacial.tipo(),
                    naveEspacial.getNombre(),
                    algunaNaveVeloz,
                    algunaNaveConPocoCombustible,
                    ningunaNaveConCombustibleCritico));
        }

        model.addAttribute("filas", filas);

        return "vista4";
    }

    @GetMapping("peticion5")
    public String peticion5(Model model) {

        List<FilaMaximaVelocidad> filas = new ArrayList<>();

        for (NaveEspacial naveEspacial : Naves.lista) {

            Optional<Nave> masVeloz = naveEspacial.getNaves().stream()
                    .max(Comparator.comparingInt(Nave::getVelocidadMaxima));

            String descripcion = masVeloz
                    .map(nave -> nave.getNombre() + " (" + nave.getVelocidadMaxima() + " km/s)")
                    .orElse("Sin naves en la lista");

            filas.add(new FilaMaximaVelocidad(naveEspacial.tipo(), naveEspacial.getNombre(), descripcion));
        }

        model.addAttribute("filas", filas);

        return "vista5";
    }
}
