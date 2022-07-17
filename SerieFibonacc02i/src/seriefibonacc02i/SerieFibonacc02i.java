/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacc02i;

import java.util.Scanner;
public class SerieFibonacc02i {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int entrada,fim,num1 = 0,num2 = 1,num3;
        
        System.out.println("Inclua o inicio de numero");
        entrada = key.nextInt();
        System.out.println("Inclua o ate onde deseja ir os sua Serie Fibonacci");
        fim = key.nextInt();
        
        while (num1 <= fim) {
            if (num1 >= entrada) {
                System.out.print(num1 + " ");
            }
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }
    
}
