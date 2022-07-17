
package hrasdejogo;

import java.util.Scanner;

public class HrasDeJogo {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int hI,hF,totalH;
        
        System.out.println("Quando começou o jogo?");
        hI = key.nextInt();
        System.out.println("Quando terminou o jogo?");
        hF=key.nextInt();
        
        //condicional de valor mair que 24h
        if (hI > 24) {
            System.out.println("ERRO!! A hora de inicio de jogo é Superior que 24h");
        }
        else if (hF > 24) {
            System.out.println("ERRO!! A hora de fim de jogo é superior a 24h");
        }else{
        
                //Condicional de entrada e saida meia noite em 0 hora
                if (hI == 0) {
                    hI = 24;
                }
                if (hF == 0) {
                    hF = 24;
            }
        
                //condicional de erro se entrada negativa 
            if (hI <0 || hF <0) {
                System.out.println("-");
            
            }else if (hI == hF) {
                totalH=24;
                System.out.println("Total de hora: " + totalH);
             }else if (hI < hF) {
                    totalH = hF - hI;
                    System.out.println("Total de hora: " + totalH);
            }
            else{
                totalH = (24 + hF) - hI;
                System.out.println("Total de hora:" + totalH);
            }
        }        
    }
}
