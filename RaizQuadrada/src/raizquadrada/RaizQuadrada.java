/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizquadrada;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class RaizQuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        float raiz = 0.00f, x;
        System.out.println("Qual ao valor que deseja usar para raiz quadrada? ");
        x = key.nextFloat();
        raiz = (float) Math.sqrt(x);
        
        System.out.println("A rais de " + x + " é: " + raiz);
        
    }
    
}
