package com.examen.laura.Controlador;

import com.examen.laura.Entidad.Empleado;
import com.examen.laura.Servicio.servicioEmpleado;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class controladorEmpleado {
    servicioEmpleado servicios = new servicioEmpleado();

    @GetMapping("/Mostrarlista")
    public ArrayList<Empleado> listarUsuario(){
        return servicios.mostrarLista();
    }


    @PostMapping("/AgregarEmpleado")
    public String agregarEmpleado(@RequestBody Empleado datos){
        return servicios.agregarEmpleado(datos);
    }


    @GetMapping("/buscarEmpleado/{cod}")
    public Empleado buscarEmpleado(@PathVariable("cod") int codigo){
        return servicios.buscarEmpleado(codigo);
    }

    @GetMapping("/eliminar/{cod}")
    public String eliminar(@PathVariable("cod") int codigo){
        return servicios.eliminar(codigo);
    }

    @PutMapping("/actualizarEmpleado")
    public String actualizarEmpleado(@RequestBody Empleado empl){
        return servicios.actualizarEmpleado(empl);
    }

    @GetMapping("/Empleadoporcargo")
    public String empleadoporcargo(@RequestBody Empleado empl) {
        return servicios.empleadoporcargo(empl);
    }
}
