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
public class Eje4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese una cantidad de grados centígrados y se mostrara en Fahrenheit");
        num = leer.nextInt();
        
        double Fahrenheit = 32 + (9 * num / 5);
        
        System.out.println("Grados Fahrenheit: "+ Fahrenheit);
    }
}
