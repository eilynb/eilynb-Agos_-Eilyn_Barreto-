package Clase3.Metodos;

import java.util.Scanner;

public class Ejercicio5 {
    //Método que reciba un número entero y un número double, y retorne su multiplicación.
    // ¿Qué tipo de retorno tiene este método?
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num= input.nextInt();

        System.out.println("Ingrese otro número");
        double num2= input.nextDouble();

       System.out.println("La multiplicación es "+multiplicar(num,num2));

    }
    public static double multiplicar (int numero1,double numero2){
        //double multiplicar=numero1*numero2;
        //return multiplicar;
        return numero1*numero2;
    }
}
