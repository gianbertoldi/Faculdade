package maiornotaturma;

import java.text.DecimalFormat;
import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class MaiorNotaTurma {

    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("0,00");
        Scanner key = new Scanner(System.in);
        //alunos e notas de tais
        int aluno [] = {0,1,2,3,4,5,6,7,8,9,10};
        int menorAl = aluno[0], maiorAl = aluno[0];
        float notaAluno [] = new float[11];
        float maior = notaAluno[0], menor = 100;
        for (int i = 1; i < notaAluno.length ; i++) {
            System.out.println("Nota do aluno");
            notaAluno[i] = key.nextFloat();
            if (notaAluno[i] >= maior) {
                maior = notaAluno[i];
                maiorAl = aluno[i];
            }
            if (notaAluno[i] < menor) {
                menor = notaAluno[i];
                menorAl = aluno[i];
            }
        }
        System.out.println(menorAl + " " + menor + " " + maiorAl + " " + maior);
    }
    
}
