package crescarvore;

import java.util.Scanner;

public class CrescArvore {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tamAr1, tamAr2, crescAr1, crescAr2, ano = 1;
        int arvMaior =0,arvMenor = 0,cresMaior = 0,cresMenos = 0;
        System.out.println("Qual o tamanho atual da arvore 'A'?");
        tamAr1 = key.nextInt();
        System.out.println("Qual o crecimeto por ano?");
        crescAr1 = key.nextInt();
        System.out.println("Qual o tamanho atual da arvore 'b'?");
        tamAr2 = key.nextInt();
        System.out.println("Qual o crecimeto por ano?");
        crescAr2 = key.nextInt();
        
        if (tamAr1 > tamAr2) {
            tamAr1 = arvMaior;
            crescAr1 = cresMaior;
            tamAr2 = arvMenor;
            crescAr2 = cresMenos;  
        } else {
            tamAr2 = arvMaior;
            crescAr2 = cresMaior;
            tamAr1 = arvMenor;
            crescAr1 = cresMenos;
        }
        
        
        if (arvMaior > arvMenor) {
            System.out.println("nunca");
        }else if ((arvMaior == arvMenor) && (cresMaior != cresMenos)) {
        ano++;
        }else{
            while (arvMaior > arvMenor) {
                arvMaior += cresMaior;
                arvMenor += cresMenos;
                ano++;
            }
            System.out.println(ano);
        }
    }

}
