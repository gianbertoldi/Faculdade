/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaleb;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class AValeB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Qual o Valor de 'A':");
        a = key.nextInt();
        System.out.println("Qual o valor de 'B':");
        b = key.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("O novo valor de 'A' é " + a + " e o valor de 'B' é: " + b);
        
        
    }
    
}
