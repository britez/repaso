package com.example.demo;

public class Perecedero extends Productos{
    private int diasACaducar;

    public Perecedero(String nombre, int precio, int diasACaducar){
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }
    public int getdiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public String toString() {

        return super.toString() + " diasACaducar=" + diasACaducar;
    }

}
