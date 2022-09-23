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
public class Eje13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese la altura que desea del cuadrado ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el ancho que desea del cuadrado ");
        num2 = leer.nextInt();
        
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (i ==0 || j==0 || i==num1-1 || j==num2-1) {
                    System.out.print("* ");
                    
                } else { System.out.print("  "); 
                
                }                
            }
            System.out.println("");
        }
    }
}
