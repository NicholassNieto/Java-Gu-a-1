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
public class Eje11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1,num2,suma,resta,mult,opc;
        double div;
        String respuesta = "";
        
        System.out.println("Ingrese el primer numero entero positivo");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero positivo");
        num2 = leer.nextInt();
      
        do {
            
       
        
        
        System.out.println("---- Menú ----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        opc = leer.nextInt();
        
        switch (opc){
            case 1:
               suma = num1 + num2;
                System.out.println("La suma de los dos numeros es : "+ suma);
                break;
            case 2:
                resta = num1 - num2;
                System.out.println("La resta de los dos numeros es: "+ resta);
                break;
            case 3:
                mult = num1+num2;
                System.out.println("La multiplicacion de los dos numeros es: "+mult);
                break;
            case 4: 
                div = num1/num2;
                System.out.println("La division de estos numeros es: "+ div);
                break;
            case 5:
                System.out.println("Desea salir? (S/N)");
                    respuesta = leer.next();
                
                if (respuesta.equals("S")) {
                    System.out.println("Muchas Gracias");
                    break;
                }else{
                    
                }
                
            default:
                System.out.println("No existe esa opcion");
              
        }
        } while (!respuesta.equalsIgnoreCase("S"));
        
    }
}
