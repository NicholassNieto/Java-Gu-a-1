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
public class Eje14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double dolares,libras,yenes,euro;
        int opc;
        String respuesta = "";
        
        System.out.println("¿Cuantos euros posee?");
        euro = leer.nextDouble();
        System.out.println("¿A que desea cambiar los "+ euro +" que posee?");
        do {
            
        
        
        System.out.println("--- Menú ---");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        System.out.println("4. Salir");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                libras = euro * 0.86;
                System.out.println("Los euros fueron cambiados a libras, serian: "+libras+" libras");
                break;
            case 2:
                dolares = euro * 1.28611;
                System.out.println("Los euros fueron cambiados a dolares, serian: "+dolares+" dolares ");
                break;
            case 3:
                yenes = euro * 129.852;
                System.out.println("Los euros fueron cambiados a yenes, serian: "+yenes+" yenes");
                break;
            case 4:
                System.out.println("Desea salir? (S/N)");
                    respuesta = leer.next();
                
                if (respuesta.equals("S")) {
                    System.out.println("Muchas Gracias");
                    break;
                }else{
                    
                }
            default:
                System.out.println("Esa opcion no existe");
                
        }
        } while (!respuesta.equalsIgnoreCase("S"));
    }
}
