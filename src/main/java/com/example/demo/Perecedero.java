package com.example.demo;

public class Perecedero extends Productos {
    private int diasACaducar;

    public Perecedero(String nombre, int precio, int diasACaducar) {
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

    public int calcular(int cantidad) {
        int precioTotal = super.calcular(cantidad);
        switch (diasACaducar) {
            case 1:
                precioTotal = precioTotal / 4;
                break;
            case 2:
                precioTotal = precioTotal / 3;
                break;
            case 3:
                precioTotal = precioTotal / 2;
                break;
        }
        return precioTotal;

    }
}
