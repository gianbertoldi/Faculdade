package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1 = 1, num2 = 0;
        System.out.print(num2 + " " + num1 + " ");
            for(int i = 0; i < 8; i++){
                
                num1 = num1 + num2;
                num2 = num1 - num2;
            
                System.out.print(" " + num1 + " ");
                
            }
    }
    
}
