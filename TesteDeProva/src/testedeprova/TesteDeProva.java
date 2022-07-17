package testedeprova;

import java.util.Scanner;

public class TesteDeProva {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int ext;
        
        System.out.println("qual exercicio quer ver?");
        ext = key.nextInt();
        
        switch (ext) {
            case 1:
                int[] vetor = new int[5];
                
                vetor[1] = key.nextInt();
                vetor[2] = key.nextInt();
                vetor[3] = key.nextInt();
                vetor[4] = key.nextInt();
        
                vetor[0] = (vetor[1] + vetor[2] + vetor[3] + vetor[4])/4;
                System.out.println(vetor[0]);
                System.out.println("Terminou");
            break;
            
            
            
        }
        
        
    }
    
}
