package com.example.demo;

public class No_perecedero extends Productos{
    private int tipo;

    public No_perecedero(String nombre, int precio, int tipo){
        super(nombre, precio);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo + '}';
    }
}
