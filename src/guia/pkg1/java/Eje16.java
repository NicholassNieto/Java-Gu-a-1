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
public class Eje16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int p=0;
        int vector[] = new int[9];
        
        for (int i = 0; i < 9; i++) {
            vector[i]=(int)(Math.random()*150);
            p=p+vector[i];
            System.out.println(vector[i]);
        }
        
    }
}
