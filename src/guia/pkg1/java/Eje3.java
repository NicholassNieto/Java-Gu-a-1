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
public class Eje3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra,palabra1;
        System.out.println("Ingrese una la palabra");
        palabra = leer.nextLine();
        palabra1 = leer.nextLine();
        
        palabra = palabra.toUpperCase();
        palabra1 = palabra1.toLowerCase();
        System.out.println("- "+ palabra);
        System.out.println("- "+palabra1);
    }
}
