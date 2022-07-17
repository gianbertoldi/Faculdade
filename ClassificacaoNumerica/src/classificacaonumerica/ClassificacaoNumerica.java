package classificacaonumerica;

import java.util.Scanner;

public class ClassificacaoNumerica {

    public static void main(String[] args) {
        Scanner key =  new Scanner(System.in);
        int  a = 1,neg = 0,pos = 0,par = 0,impar = 0;
        while ( a!=0 ) {
            System.out.println("Qual o Valor");
            a = key.nextInt();
            if (a > 0) {
              pos++;
            }
            if (a<0) {
                neg++;
            }
            if ((a%2 == 0) && (a!=0)) {
                par++;
            }
            if (a%2!=0) {
                impar++;
            }
            
        }
        System.out.println(pos + " - " + neg + " - " + par + " - " + impar);
    }
    
}
