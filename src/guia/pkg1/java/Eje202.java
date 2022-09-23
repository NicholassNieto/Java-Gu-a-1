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
public class Eje202 extends Eje20{
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][]m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el dato de la fila "+i);
                int d = leer.nextInt();
                m[i][j] = d;
            }
        }
        esMagico(m);
    }
}
