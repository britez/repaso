package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        List<Integer> numbersArray = Arrays.asList(1, 4, 1);
        int[] list = {8, 7, 9, 4, 5, 3, 6};
        int[] numbers = {7, 13, 20, 5, 9, 32, 10, 6};

        sum(2, 2, 3);
        sumarLista(numbersArray);
        largerNumbers(numbers);
        maximumNumber(3, 4, 1);
        ascendingList(list);
        descendingList(list);

    }

    public static int sum(Integer a, Integer b, Integer c) {            // ejercicio 1
        Integer result = a + b + c;
        System.out.println("- La suma de los numeros ingresados es: " + result);
        return result;
    }

    public static int sumarLista(List<Integer> numbersArray) {           //ejercicio 2

        int suma = 0;
        for (Integer e : numbersArray) {
            suma = suma + e;

        }
        System.out.println("- La suma de la lista es: " + suma);
        return suma;
    }

    public static ArrayList<Integer> largerNumbers(int[] numbers) {        // ejercicio 3


        ArrayList<Integer> numbersGreaterThanTen = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                numbersGreaterThanTen.add(numbers[i]);
            }
        }
        System.out.println("- Los numeros mayores a diez son: " +numbersGreaterThanTen);
        return numbersGreaterThanTen;
    }

    public static int maximumNumber(Integer a, Integer b, Integer c) {      //ejercicio 4
        Integer max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("- El maximo entre los tres numeros es: " + max);
        return max;

    }
    public static int[] ascendingList(int [] list) {          //ejercicio 5

        for (int j = 0; j < list.length; j++) {

            for (int i = 0; i < (list.length - 1 -j); i++) {
                if (list[i] > list[i + 1]) {
                    int aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                }
            }
        }
        //cuando j= 0 e i = 0 queda 7,8,9,4,5,3,6
        //cuando j= 0 e i = 0 queda 7,8,9,4,5,3,6
        //cuando i= 2 queda 7,8,4,9,5,3,6
        //cuando i= 3 queda 7,8,4,5,9,3,6
        //cuando i= 4 queda 7,8,4,5,3,9,6
        //cuando i= 5 queda 7,8,4,5,3,6,9


        //cuando i=0 queda 7,8,4,5,3,6,9
        //cuando i=1 queda 7,4,8,5,3,6,9
        //cuando i=2 queda 7,4,5,8,3,6,9
        //cuando i=3 queda 7,4,5,3,8,6,9
        //cuando i=4 queda 7,4,5,3,6,8,9

        //cuando i=0 queda 4,7,5,3,6,8,9
        //cuando i=1 queda 4,5,7,3,6,8,9
        //cuando i=2 queda 4,5,3,7,6,8,9
        //cuando i=3 queda 4,5,3,6,7,8,9

        //cuando i=0 queda 4,5,3,6,7,8,9
        //cuando i=1 queda 4,3,5,6,7,8,9
        //cuando i=2 queda 4,3,5,6,7,8,9

        //cuando i=0 queda 3,4,5,6,7,8,9
        //cuando i=1 queda 3,4,5,6,7,8,9




        System.out.println("- La lista actualizada de forma ascendiente es: " + Arrays.toString(list));
        return list;
    }


    public static int[] descendingList(int[] list) {          //ejercicio 6


        for (int j = 0; j < list.length; j++) {

            for (int i = 0; i < (list.length - j -1); i++) {
                if (list[i] < list[i + 1]) {
                    int aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                }
            }
        }
        System.out.println("- La lista actualizada de forma descendiente es: " + Arrays.toString(list));
        return list;
    }


}
