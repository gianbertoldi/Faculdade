package acimadamedia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AcimaDaMedia {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.0"); 
        int alunos,i = 0, cont = 0;
        double acima = 0,soma = 0,media = 0, bonsAlunos;
        
        System.out.println("Quantos alunos deseja Adicionar");
        alunos = key.nextInt();
        double notas[] = new double[alunos];
        
        if (alunos > 0) {
            for (i = 0; i != alunos; i++) {
                System.out.println("Qual a nota do " + ++cont);
                notas[i] = key.nextDouble();
                soma += notas[i];
                media = soma/alunos;
            }
            if (i == alunos) {
                for (int j = 0; j != alunos; j++) {
                    if (notas[j] > media) {
                        acima++;
                    }
                }
            }
            
        }
        bonsAlunos = (acima*100)/alunos;
        System.out.println(dec.format(bonsAlunos) + "%");
    }
}
