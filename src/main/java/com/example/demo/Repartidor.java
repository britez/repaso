package com.example.demo;

public class Repartidor extends Empleado {

    public String zona;

    public Repartidor(String nombre, int edad, int salario, String zona){
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String toString() {
        return super.toString() + " zona = " + zona;
    }

    @Override
    public boolean plus() {
        return false;
    }


}
