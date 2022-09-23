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
public class Eje5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,numDoble,numTriple;
      
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        numDoble = num * 2;
        numTriple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("Doble del numero: "+ numDoble );
        System.out.println("Triple del numero: "+ numTriple);
        System.out.println("Raiz Cuadrada del numero: "+ raiz);
    }
}
