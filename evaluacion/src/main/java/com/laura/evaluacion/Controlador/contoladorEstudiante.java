package com.laura.evaluacion.Controlador;

import com.laura.evaluacion.Entidad.Estudiante;
import com.laura.evaluacion.Servicio.servicioEstudiante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class contoladorEstudiante {

    servicioEstudiante servicio = new servicioEstudiante();

    @GetMapping("/listarEstudiante")
    public ArrayList<Estudiante> listarEstudiante(){
        return servicio.mostrarEstudiante();
    }

    @PostMapping("/AgregarEstudiante")
    public String agregarEstudiante(@RequestBody Estudiante est){
        return servicio.agregarEstudiante(est);
    }

    @GetMapping("/buscarEstudiante/{id}")
    public Estudiante buscarEstudiante(@PathVariable("id") int id){
        return servicio.buscarEstudiante(id);
    }

    @GetMapping("/eliminarEstudiante/{id}")
    public String eliminarEstudiante(@PathVariable("id") int id){
        return servicio.eliminarEstudiante(id);
    }
}
