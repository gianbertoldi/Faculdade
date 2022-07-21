package leiturasemrepeticao;

import java.util.Scanner;

public class LeituraSemRepeticao {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int cons = 1, x = 1;
        int valor[] = new int[11], tela[] = new int[11];
        
        
        for (int i = 1; i != 11; i++) {
            while(cons != 0){
                cons = key.nextInt();
                valor[i] = cons;
                tela[x] = valor[i];
                System.out.println(tela[x]);
            }
            if (valor[i] != tela[x]) {
                tela[x] = valor[i];
                x++;
                System.out.println(tela[x]);
            }
        }
        for (int y = 0; y < 10; y++) {
            System.out.print(tela[x] + " ");
        }
        
    }
}
