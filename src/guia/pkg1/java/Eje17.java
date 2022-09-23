/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.java;

import java.util.Scanner;

/**
 *
 * @author nniet
 */
public class Eje17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int p=0;
        int [] vector = new int[9];
        
        for (int i = 0; i < 9; i++) {
            vector[i]=(int)(Math.random()*150);
            p=p+vector[i];
            System.out.println(vector[i]);
        }
        int Cant = 0;
        int temp = p;
       
        while (temp>0) {
            temp = temp/10;
            Cant++;
        }
        System.out.println("Cantidad de digitos");
        System.out.println(p+" Tiene una cantidad de: "+ Cant);
        
    }
}
