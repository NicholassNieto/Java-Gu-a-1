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
public class Eje6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero y luego se revisara si es par o impar");
        num = leer.nextInt();
        if (num % 2 == 0 ) {
            System.out.println("Numero par");
            
        }else{
            System.out.println("Numero impar");
        }
    }
}
