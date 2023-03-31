package com.laura.evaluacion.Entidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String curso;
    private String[] materias = new String[3];
    private int[] notas = new int[3];

    public Estudiante(int id, String nombre, String apellido, String curso, String[] materias, int[] notas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.materias = materias;
        this.notas = notas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", curso='" + curso + '\'' +
                ", materias=" + Arrays.toString(materias) +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
