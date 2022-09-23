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
public class Eje19 {
    public static void main(String[] args) {
        int A[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int AT[][]=new int[3][3];
        boolean band = true;
        boolean band2 = true;
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+ A[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        System.out.println();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][i] != A[j][i]) {
                    band = false;
                    i = 3;
                    break;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[j][i] =(-1) * A[j][i];
                AT[i][j] = A[j][i];
                A[j][i] = (-1) * A[j][i];
                if (AT[i][j] != A[i][j]) {
                    band2 = false;
                    i = 3;
                    break;
                }
            }
        }
        if (band) {
            System.out.println("La matriz es simetrica");
            
        }else{System.out.println("La matriz no es simetrica");
     
        }
        if (band2) {
            System.out.println("La matriz es simetrica");
            
        }else{
            System.out.println("la matriz no es simetrica");
        }
    }
}
