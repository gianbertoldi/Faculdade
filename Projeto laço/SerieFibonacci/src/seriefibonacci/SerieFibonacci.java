package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1 = 1, num2 = 0, entrada, fim,temp = 0;
        System.out.println("Inclua o inicio de numero");
        entrada = key.nextInt();
        System.out.println("Inclua o ate onde deseja ir os sua Serie Fibonacci");
        fim = key.nextInt();
         for(int i = 0; i < fim; i++){
             
         }
        
            for(int i = 0; i < fim; i++){
                
                num1 = num1 + num2;
                num2 = num1 - num2;
            
                if ((num1 > entrada) 
                    && (num2 < fim)) 
                {
                
                System.out.print(num2 + " ");
                System.out.println(i);
                }    
            }
        
        
        
        
           
        
    }
    
}
