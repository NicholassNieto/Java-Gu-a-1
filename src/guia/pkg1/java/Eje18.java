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
public class Eje18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        
        System.out.println("Digite la matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz["+i+"] ["+j+"]:" );
                matriz[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("La matriz original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        int aux;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("La matriz traspuesta es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
