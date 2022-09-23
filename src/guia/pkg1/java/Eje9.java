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
public class Eje9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase que contega una A al principio");
        frase = leer.nextLine();
        
        if (frase.substring(0,1).equals("A")) {
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
        }
    }
}
