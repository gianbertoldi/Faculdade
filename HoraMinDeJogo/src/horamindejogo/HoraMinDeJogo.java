package horamindejogo;

import java.util.Scanner;

public class HoraMinDeJogo {

    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
        int hI,hF,totalH,minI,minF,totalMin, nHora = 0;
        String erro = "ERRO!! Valor informado invalido";
        
        System.out.println("Me informe apanes a HORA que começou o jogo");
        hI = key.nextInt();
        System.out.println("Me infome os minutos da hora que começou o jogo");
        minI = key.nextInt();
        System.out.println("Me informe apanes a HORA que terminou o jogo");
        hF=key.nextInt();
        System.out.println("Me infome os minutos da hora que terminou o jogo");
        minF = key.nextInt();
        
        //condicional de valor mair que 24h
        if (hI > 24) {
            System.out.println(erro);
        }
        else if (hF > 24) {
            System.out.println(erro);
        }else{
            //Condicional de entrada e saida meia noite em 0 hora
            if (hI == 0) {
                hI = 24;
            }
            if (hF == 0) {
                hF = 24;
            }
        
            if (minI > 60) {
                System.out.println(erro);
            }else if (minF > 60) {
                System.out.println(erro);
            } else {
                //Condicional de entrada com min 60
                if (minI == 60) {
                    minI = 0;
                }
                if (minF == 60) {
                    minF = 0;
                }
            }
                
            //contagem de minutos
            if (minI < minF){
                
                totalMin = minF-minI;
                
            } else if (minI == minF) {
                
                totalMin = 00;
                
            } else {
                totalMin = (60 + minF)- minI;
                nHora++;
            }
                
        
            //condicional de erro se entrada negativa 
            if ((hI <0 || hF <0) || (minI < 0 || minF < 0))  {
                 
                System.out.println("-");
                
            //Contagem de hora
            } else if ((hI == hF) && (minI < minF) ) {
                totalH = 00;
                System.out.printf("Total de hora:%02d:%02d",totalH,totalMin);
                
            } else if (hI < hF) {
                    
                totalH = hF - hI;
                totalH = totalH - nHora;
                System.out.printf("Total de hora: " + totalH + ":%02d",totalMin);
                
            } else {
                
                totalH = (24 + hF) - hI;
                totalH = totalH - nHora;
                System.out.printf("Total de hora:" + totalH + ":%02d",totalMin);
            }
        }        
    }
    
}
