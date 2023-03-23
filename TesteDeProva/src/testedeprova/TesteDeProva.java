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
                int soma = 0;
                
                vetor[1] = key.nextInt();
                vetor[2] = key.nextInt();
                vetor[3] = key.nextInt();
                vetor[4] = key.nextInt();
        
                for (int i = 0; i < 4; i++){
                    vetor[i] = key.nextInt();
                    vetor[4] += vetor[i];
                }
                vetor[4] /= 4;
                System.out.println(vetor[4]);
                System.out.println("Terminou");
            break;
            
            
            
        }
        
        
    }
    
}
