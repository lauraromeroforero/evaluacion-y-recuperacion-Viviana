package com.examen.laura.Servicio;

import com.examen.laura.Entidad.Empleado;

import java.util.ArrayList;

public class servicioEmpleado {
    ArrayList<Empleado> lista = new ArrayList<>();
    Empleado datos = new Empleado();

    public servicioEmpleado(){
        lista.add(new Empleado(1034524452, "Liz", "Diaz", "Supervisora","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1862586525, "Erick", "Cantor", "Contratista","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1031445212, "Ana", "Corredor", "Supervisora","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1686286565, "Omar", "Tauta", "Contratista","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1962969669, "Paula", "Diaz", "Supervisora","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1896896968, "Santiago", "Dante", "Contratista","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1965896589, "Laura", "Forero", "Supervisora","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1896896558, "Lorena", "Romero", "Contratista","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1234567890, "Brayan", "Quiroga", "Supervisora","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
        lista.add(new Empleado(1098765432, "Josept", "Forero", "Contratista","1650000", new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}, new int[]{10, 20, 30, 40, 50}));
    }

    public ArrayList<Empleado> mostrarLista(){
        return lista;
    }

    public String agregarEmpleado(Empleado datos){
        lista.add(datos);
        return "REGISTRO EXITOSO";
    }

    public Empleado buscarEmpleado(int codigo){
        for (Empleado e: lista){
            if (e.getCedula() == codigo){
                return e;
            }
        }
        return null;
    }

    public String eliminar(int codigo){

        for (int i = 0; i < lista.size(); i++){
            if ( codigo == lista.get(i).getCedula() ){
                lista.remove(i);
            }
        }
        return null;

    }

    public String actualizarEmpleado(Empleado empleado){
        for (Empleado e: lista){
            if (e.getCedula() == empleado.getCedula()){
                e.setNombre(empleado.getNombre());
                e.setApellido(empleado.getApellido());
                e.setCargo(empleado.getCargo());
                e.setSalario(empleado.getSalario());
                e.setNocturnas(empleado.getNocturnas());
                e.setFestivas(empleado.getFestivas());
                e.setVentas(empleado.getVentas());
            }
        }
        return "ACTUALIZO EXITOSO";
    }

    public String empleadoporcargo(Empleado empleado){
        for (Empleado e: lista){
        }
        return "ACTUALIZO EXITOSO";
    }
}
