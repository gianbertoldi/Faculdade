package intervaloentrenum;

import java.util.Scanner;

public class IntervaloEntreNum {

    public static void main(String[] args) {
        Scanner key =  new Scanner(System.in);
        int  a = 1,cont = 0,inicio,fim;
        System.out.println("Qual o primro valor");
        inicio = key.nextInt();
        System.out.println("Ate onde deseja saber o intevalado");
        fim = key.nextInt();
        
        while (a!=0) {
            System.out.println("Qual o Valor");
            a = key.nextInt();
            if ((a >= inicio) && (a <= fim)) {
              cont++;
            }
        }
        System.out.println(cont);
    }
    
}
