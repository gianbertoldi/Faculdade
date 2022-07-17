/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardeX;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class GuardeX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        double x, raiz, res, met;
        
        
        System.out.println("Qual o Valor de X?");
        x = key.nextDouble();
         raiz = Math.sqrt(x);
        System.out.println("A raiz de x é: " + raiz);
        
        res = x / 3;
        int i = (int) Math.round(res);
        System.out.println("O resultado da divisão por inteiro é: " + i);
        
        met =(x/2)/x;
        System.out.println("A metade dividida pela metade é: " + met);
        
        
        
        
    }
    
}
