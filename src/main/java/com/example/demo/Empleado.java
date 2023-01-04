package com.example.demo;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    //private static int plus =300 ;
    public final double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

        public String toString () {
            return "nombre = " + nombre + ", edad = " + edad + ", salario = " + salario;
        }

        public abstract boolean plus ();

}
