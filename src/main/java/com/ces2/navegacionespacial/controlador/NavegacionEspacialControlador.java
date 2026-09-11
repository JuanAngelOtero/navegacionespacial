package com.ces2.navegacionespacial.controlador;

import com.ces2.navegacionespacial.modelo.Estrella;
import com.ces2.navegacionespacial.modelo.Nave;
import com.ces2.navegacionespacial.modelo.NaveAlienijena;
import com.ces2.navegacionespacial.modelo.NaveEspacial;
import com.ces2.navegacionespacial.modelo.ResultadoNave;
import com.ces2.navegacionespacial.modelo.Satelite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NavegacionEspacialControlador {

    @GetMapping("/")
    public String mostrarNavegacion(Model model) {

        List<NaveEspacial> flota = new ArrayList<>();

        flota.add(new NaveAlienijena(
                new Nave("Zeta-1", "Disco Volador", 3000, 90, "Marte"),
                "Andromeda", "antimateria", 95));
        flota.add(new NaveAlienijena(
                new Nave("Zeta-2", "Ovni Triangular", 4200, 75, "Jupiter"),
                "Via Lactea", "plasma", 80));
        flota.add(new NaveAlienijena(
                new Nave("Zeta-3", "Sonda Gris", 2500, 60, "Venus"),
                "Nebulosa de Orion", "curvatura", 70));

        flota.add(new Satelite(
                new Nave("Orbita-1", "CubeSat", 8, 100, "Tierra"),
                "NASA", 550, 12.5));
        flota.add(new Satelite(
                new Nave("Orbita-2", "Geoestacionario", 3, 100, "Tierra"),
                "ESA", 35786, 4.2));
        flota.add(new Satelite(
                new Nave("Orbita-3", "Meteorologico", 7, 95, "Tierra"),
                "NOAA", 830, 8.1));

        flota.add(new Estrella(
                new Nave("Sol-A", "Sonda Solar", 620, 40, "Mercurio"),
                "G", 1.0, 5778));
        flota.add(new Estrella(
                new Nave("Sol-B", "Explorador Estelar", 700, 55, "Proxima b"),
                "M", 0.12, 3042));
        flota.add(new Estrella(
                new Nave("Sol-C", "Nave Cientifica", 900, 65, "Kepler-22b"),
                "A", 2.1, 9600));

        List<ResultadoNave> resultados = new ArrayList<>();
        for (NaveEspacial naveEspacial : flota) {
            Nave nave = naveEspacial.getNave();
            resultados.add(new ResultadoNave(
                    naveEspacial.tipo(),
                    nave.getNombre(),
                    naveEspacial.despegar(nave),
                    naveEspacial.orbitar(nave),
                    naveEspacial.aterrizarEnPlaneta(nave)));
        }

        model.addAttribute("titulo", "Trabajo 1 - Polimorfismo: navegar en el espacio");
        model.addAttribute("resultados", resultados);
        return "resultado";
    }
}
