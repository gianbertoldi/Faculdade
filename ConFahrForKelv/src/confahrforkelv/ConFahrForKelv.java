/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confahrforkelv;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class ConFahrForKelv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        float F, C, K = 0.00f;
        
        System.out.println("Qual a teamperatura em Fahrenheit?");
        F = key.nextFloat();
        C = 5 * (F - 32)/9;
        
        K = C + 273;
        System.out.println("A temperatura em kelvin é de: " + deci.format(K));
    }
    
}
