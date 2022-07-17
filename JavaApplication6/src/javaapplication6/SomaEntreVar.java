/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class SomaEntreVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, res;
        Scanner key = new Scanner(System.in);
        
        System.out.println("Qual o primerio valor da soma?");
        a =  key.nextInt();
        System.out.println("Qual o segundo valor da soma?");
        b = key.nextInt();
        
        res = a + b;
        System.out.print("O resultado da soma é: " + a + " + " + b + " = " + res);
        
    }
    
}
