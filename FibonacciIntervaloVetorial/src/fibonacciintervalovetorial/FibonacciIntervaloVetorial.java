package fibonacciintervalovetorial;

import java.util.Scanner;

public class FibonacciIntervaloVetorial {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int entrada,fim, i;
        int serie[] = new int[30];
        
        serie[0] = 0;
        serie[1] = 1;
        
        for (i = 2; i != 30; ++i) {
            serie[i] = serie[i-1] + serie[i-2];
        }
        System.out.println("Qual o valor de inicio da serie?");
        entrada = key.nextInt();
        System.out.println("Qual o valor para terminar a serie?");
        fim = key.nextInt();
        
        while (serie[i] <= fim){
            System.out.println("passou do while");
            if (serie[i] >= entrada) {
                System.out.println("passou do IF");
                System.out.print(" " + serie[i]);
            }
        }
    }
}
