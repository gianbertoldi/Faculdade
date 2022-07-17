package intervalos;

import java.util.Scanner;

public class Intervalos {

    public static void main(String[] args) {
        Scanner key =  new Scanner(System.in);
        int  a = 1,cont = 0;
        while ( a!=0 ) {
            System.out.println("Qual o Valor");
            a = key.nextInt();
            if ((a > 100) && (a<200)) {
              cont++;
            }
            
        }
        System.out.println(cont);
    }
    
    
}
