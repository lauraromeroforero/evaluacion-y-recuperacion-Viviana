package com.laura.evaluacion.Servicio;

import com.laura.evaluacion.Entidad.Estudiante;

import java.util.ArrayList;

public class servicioEstudiante {
    private ArrayList<Estudiante> lista = new ArrayList<>();

    public servicioEstudiante(){
        lista.add(new Estudiante(1,"laura","forero","once",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(2,"paula","castillo","decimo",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(3,"karol","lopez","noveno",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(4,"derly","jimenez","octavo",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(5,"omar","dias","septimo",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(6,"viviana","forero","sexto",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(7,"michael","lozano","quinto",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(8,"ana","corredor","cuarto",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(9,"liz","carrero","tercero",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
        lista.add(new Estudiante(10,"erick","cantor","segundo",new String[]{"Matematicas","Fisica","Quimica"}, new int[]{1,2,3}));
    }

    public ArrayList<Estudiante> mostrarEstudiante(){
        return lista;
    }

    public String agregarEstudiante(Estudiante datos){
        lista.add(datos);
        return "Usuario registrado exitosamente";
    }

    public Estudiante buscarEstudiante(int id){
        for(Estudiante e: lista){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public String eliminarEstudiante(int id){
        for (int i = 0; i < lista.size(); i++){
            if ( id == lista.get(i).getId() ){
                lista.remove(i);
            }
        }
        return null;
    }
}
