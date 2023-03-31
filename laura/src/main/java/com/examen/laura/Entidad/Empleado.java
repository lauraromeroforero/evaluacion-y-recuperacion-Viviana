package com.examen.laura.Entidad;

import java.util.Arrays;

public class Empleado {
    private int cedula;
    private String nombre;
    private String apellido;
    private String cargo;
    private String salario;
    private int[] nocturnas = new int[5];
    private int[] festivas = new int[5];
    private int[] ventas = new int[5];

    public Empleado(int cedula, String nombre, String apellido, String cargo, String salario, int[] nocturnas, int[] festivas, int[] ventas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.nocturnas = nocturnas;
        this.festivas = festivas;
        this.ventas = ventas;
    }

    public Empleado() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int[] getNocturnas() {
        return nocturnas;
    }

    public void setNocturnas(int[] nocturnas) {
        this.nocturnas = nocturnas;
    }

    public int[] getFestivas() {
        return festivas;
    }

    public void setFestivas(int[] festivas) {
        this.festivas = festivas;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario='" + salario + '\'' +
                ", nocturnas=" + Arrays.toString(nocturnas) +
                ", festivas=" + Arrays.toString(festivas) +
                ", ventas=" + Arrays.toString(ventas) +
                '}';
    }
}
