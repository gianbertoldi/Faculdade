
package crescarvorerev;

import java.util.Scanner;

public class CrescArvoreRev {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //Valore iniciados
        int arvoreUm, arvoreDois,creUm, creDois;
        int ano = 0, arvMaior = 0, arvMenor = 0,cresMaior = 0,cresMenor = 0;
        
        //entrada de valores da primera arvore
        System.out.println("Qual o tamanho da primera arvore?");
        arvoreUm = key.nextInt();
        System.out.println("O quanto ela cresce por ano?");
        creUm = key.nextInt();
        //Entrada de valores da segunda arvore
        System.out.println("Qual o tamanho da segunda arvore?");
        arvoreDois = key.nextInt();
        System.out.println("O quanto ela cresce por ano?");
        creDois = key.nextInt();
        
        if (arvoreUm > arvoreDois) {
            arvoreUm = arvMaior;
            arvoreDois = arvMenor;
            cresMaior = creUm;
            cresMenor = creDois; 
        } else {
            arvoreUm = arvMenor;
            arvoreDois = arvMaior;
            cresMaior = creDois;
            cresMenor = creUm;
        }
        
        
        if (arvoreUm == arvoreDois) {
            if (cresMaior > cresMenor) {
                cresMaior = creUm;
                cresMenor = creDois;
            }    
        }
        
        if (cresMaior >= cresMenor) {
            System.out.println("nunca");
        } else {
            while (arvMaior > arvMenor) {
                arvMaior += cresMaior;
                arvMenor += cresMenor;
                ano++;
                System.out.println("");
            }
        System.out.println(ano);
        }
        
        
    }
    
}
