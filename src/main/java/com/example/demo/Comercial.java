package com.example.demo;

public class Comercial extends Empleado {
    private double comision;

    public Comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;

    }
    public String toString() {
        return super.toString() + " comision = " + comision;
    }

    public boolean plus() {

        if (super.getEdad() > 30 && this.comision > 200) {

            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado " + super.getNombre());
            return true;
        }
        return false;
    }



//


}
