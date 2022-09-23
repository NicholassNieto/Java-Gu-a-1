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
public class Eje15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] arreglo = new int[101];
        for (int i = 0; i < 101; i++) {
            arreglo[i] = i;
            
        }
        System.out.println("Contenido del arreglo");
        for (int i = 0; i < 101; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
