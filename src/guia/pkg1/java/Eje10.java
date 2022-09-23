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
public class Eje10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numLimite,num1,num2,num3,suma,suma2;
       
        System.out.println("Ingrese un valor limite positivo");
        numLimite = leer.nextInt();
        
        System.out.println("Realice la suma para superar el valor limite");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        suma = num1+num2;
        System.out.println("La suma de ambos valores es: "+ suma);
        
        while (suma <= numLimite){
            System.out.println("Valor limite no superado, continuee");
            num3 = leer.nextInt();
            suma2 = suma + num3;
            suma = suma2;
            System.out.println("La suma repetida es: "+ suma2 );
        }
        System.out.println("El valor limite fue superado");
    }
}
