package Clase5;

import java.util.Scanner;

public class Libreria {
    public static void main (String args[]){
        Scanner input= new Scanner(System.in);
        Libro Libro1= new Libro();
        System.out.println(Libro1);

        System.out.println("Ingrese los datos del libro");

        System.out.println("Ingrese el ISBN");
        int isbn1= input.nextInt();
        System.out.println("Ingrese el Nombre del libro");
        String nombre1= input.next();
        System.out.println("Ingrese el Numero de páginas");
        int pag1= input.nextInt();
        System.out.println("Ingrese el Autor del libro");
        String autor1= input.nextLine();

        Libro Libro2= new Libro(isbn1,nombre1, pag1, autor1);
        Libro2.setIsbn(isbn1);
        Libro2.setTitulo(nombre1);
        Libro2.setNumeroPaginas(pag1);
        Libro2.setAutor(autor1);

        System.out.println(Libro2);
    }
}
