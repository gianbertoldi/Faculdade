/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertfahrforcel;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class ConvertFahrForCel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        float F, C;
        
        System.out.println("Qual a teamperatura em Fahrenheit?");
        F = key.nextFloat();
        C = 5 * (F - 32)/9;
        
        System.out.println("A temperatura em C° é: " + C);
        
        
    }
    
}
