package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empleado> empleados;

    public Empresa (){
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleadoAAgregar){
        this.empleados.add(empleadoAAgregar);
    }

    public List<Empleado> receiveList(){

        ArrayList<Empleado> resultado = new ArrayList<Empleado>();
        for (int i = 0; i < empleados.size(); i++) {
            Empleado comercial = empleados.get(i);

            if (comercial.getEdad() > 20) {
                resultado.add(comercial);
            }
        }
        System.out.println("LOS 5 EMPLEADOS SON: " + resultado);

        return resultado;

    }

    public void mostrarEmpleados(){
        for (int i=0;i<empleados.size(); i++){
            System.out.println(imprimirEmpleado(empleados.get(i)));
        }
    }

    public String imprimirEmpleado(Empleado empleadoImprimir){
        return "Empleado " + empleadoImprimir.toString();
    }

    public String imprimirEmpleado(Repartidor repartidorImprimir){
        return "Repartidor " + repartidorImprimir.toString();
    }
}
