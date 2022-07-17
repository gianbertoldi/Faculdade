    
package projetobea;

import java.util.Random;
import java.util.Scanner;



public class ProjetoBea {

  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random ger = new Random();
      
        String jogada;
        int  ia, pj = 0, pc = 0;
        System.out.println("Faça sua jogada!!" + "\nEscolha um das opções" + 
                "\n1: Tesoura" + "\n2: Pedra" + "\n3: Papel");
        
        while ((pc < 3) && (pj < 3)) {
             System.out.println("Placar Jogador " + pj + " Computador " + pc);
             
             jogada = key.next();
             ia = ger.nextInt(3) + 1;


             switch (jogada){

                 case "1":

                     switch (ia){ 

                         case 1:
                             System.out.println("Voce Jogou Tesoura");
                             System.out.println("Computador jogou Tesoura");
                             System.out.println("Empate");
                            break;

                         case 2:
                             pc++;
                             System.out.println("Voce Jogou Tesoura");
                             System.out.println("Computador jogou Pedra");
                             System.out.println("Computador ganhou");
                            break;

                         case 3:
                             pj++;
                             System.out.println("Voce Jogou Tesoura");
                             System.out.println("Computador jogou Papel");
                             System.out.println("Voce ganhou");
                            break;      
                        } 
                     break;

                 case "2":
                     switch (ia){ 

                         case 1:
                             pj++;
                             System.out.println("Voce Jogou pedra");
                             System.out.println("Computador jogou Tesoura");
                             System.out.println("Voce ganhou");
                            break;

                         case 2:
                             System.out.println("Voce Jogou pedra");
                             System.out.println("Computador jogou Pedra");
                             System.out.println("empate");
                            break;

                         case 3:
                             pc++;
                             System.out.println("Voce Jogou pedra");
                             System.out.println("Computador jogou Papel");
                             System.out.println("Computador ganhou");
                            break;    

                        } 
                     break;
                 case "3":
                     switch (ia){ 

                         case 1:
                             pc++;
                             System.out.println("Voce Jogou papel");
                             System.out.println("Computador jogou Tesoura");
                             System.out.println("Computador ganhou");
                            break;

                         case 2:
                             pj++;
                             System.out.println("Voce Jogou papel");
                             System.out.println("Computador jogou Pedra");
                             System.out.println("Voce venceu");
                            break;

                         case 3:
                             System.out.println("Voce Jogou papel");
                             System.out.println("Computador jogou Papel");
                             System.out.println("empate");
                            break;
                     }
                     break;
                    default:
                         System.out.println("Voce sabe o que é escolher um numero de 1 a 3");
                         System.out.println("Escolha um das opções" + "\n1: Tesoura" + "\n2: Pedra" + "\n3: Papel");
                         
            } 
             
         }
    } 
    
}
