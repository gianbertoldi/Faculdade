package pagamentoemnotas;

import java.util.Scanner;

public class PagamentoEmNotas {

    public static void main(String[] args) {
         Scanner key = new Scanner(System.in);
         int saque;
         
         System.out.println("Qual o valor do saque");
         saque = key.nextInt();
         
         System.out.println(saque/100 + " de 100");
         saque = saque%100;
         
         System.out.println(saque/20 + " de 20");
         saque = saque%20;
         
         System.out.println(saque/5 + " de 5");
         saque = saque%5;
         
         System.out.println(saque/1 + " de 1");
         saque = saque%1;
                        
    }
}
    

