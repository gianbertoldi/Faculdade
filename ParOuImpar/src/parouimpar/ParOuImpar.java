package parouimpar;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        int x;
        
        System.out.println("Qual valor deseja saber se par ou impar");
        x = key.nextInt();
        
        if (x%2 == 0) {
            System.out.println("par");
        }
        else {
            System.out.println("ímpar");
        }
        
    }
    
}
