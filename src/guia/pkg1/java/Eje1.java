package guia.pkg1.java;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nniet
 */
public class Eje1 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1,num2,suma;
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos numeros es: "+ suma);
        
    }
}
