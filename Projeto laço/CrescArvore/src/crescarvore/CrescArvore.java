package crescarvore;

import java.util.Scanner;

public class CrescArvore {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        long tamAr1, tamAr2, crescAr1, crescAr2, ano = 1;
        System.out.println("Qual o tamanho atual da arvore 'A'?");
        tamAr1 = key.nextInt();
        System.out.println("Qual o crecimeto por ano?");
        crescAr1 = key.nextInt();
        System.out.println("Qual o tamanho atual da arvore 'b'?");
        tamAr2 = key.nextInt();
        System.out.println("Qual o crecimeto por ano?");
        crescAr2 = key.nextInt();
        if (crescAr1 >= crescAr2) {
            System.out.println("nunca");
        } else {
            while (tamAr1 > tamAr2) {
                tamAr1 = tamAr1 + crescAr1;
                tamAr2 = tamAr2 + crescAr2;
                ano++;
            }
            System.out.println(ano);
        }
    }

}
