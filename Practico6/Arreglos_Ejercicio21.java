package Clase6.EjerciciosArreglos;

import java.util.Scanner;

public class Arreglos_Ejercicio21 {
    //Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
    //Los numeros deben ser ingresados por el usuario. Luego, mostrar la cantidad de
    //números positivos, negativos y ceros:
    //Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] arregloNumeros = new int[5];
        int num=0;
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el número "+(i+1));
            arregloNumeros[i]=input.nextInt();
        }
        imprimirArreglo(arregloNumeros);
        }

    public static void imprimirArreglo(int [] arreg){
        for (int i=0;i<arreg.length; i++){
            System.out.println("El valor de la posición "+(i+1)+" del arreglo es: "+arreg[i]);
        }

    }
    public static void tiposNumeros(int [] arregloNumeros){
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        for (int i = 0; i < arregloNumeros.length; i++) {
            if (arregloNumeros[i] > 0) {
                positivos++;
            } else if (arregloNumeros[i] < 0) {
                negativos--;
            } else {
                ceros++;
            }
            System.out.println("Hay " + positivos + " números mayores a 0");
            System.out.println("Hay " + negativos + " números menores a 0");
            System.out.println("Hay " + ceros + " números iguales a 0");
        }
    }
}


/*
        public static void tiposNumeros(int [] ){
            int negativos = 0;
            int positivos = 0;
            int ceros = 0;

            for (int i = 0; i < arregloNumeros.length; i++) {
                if (arregloNumeros[i] > 0) {
                    positivos++;
                } else if (numeros[i] < 0) {
                    negativos--;
                } else {
                    ceros++;
                }
                System.out.print("Hay " + positivos + " números mayores a 0");
                System.out.print("Hay " + negativos + " números menores a 0");
                System.out.print("Hay " + ceros + " números iguales a 0");
            }
        }

 */