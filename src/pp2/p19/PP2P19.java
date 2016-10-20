/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p19;

import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        double a;
        //Proceso
        a = pedir ("angulo");
        mostrar (a);
    }
     public static double pedir (String a){
        double b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el "+a);
        b = teclado.nextDouble();
        return b;
    }
     public static void mostrar (double a){
         //Se transforma el numero a radianes
         double b = Math.toRadians(a);
         System.out.println("El seno de "+a+" es "+Math.sin(b));
         System.out.println("El coseno de "+a+" es "+Math.cos(b));
         System.out.println("La tangente de "+a+" es "+Math.tan(b));
     }
}
