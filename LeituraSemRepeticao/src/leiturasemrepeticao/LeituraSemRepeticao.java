package leiturasemrepeticao;

import java.util.Scanner;

public class LeituraSemRepeticao {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int temp = 1,cont = 0, x = 0, j = 0, i;
        int v[] = new int[10], tela[] = new int[10];
        
        while(temp != 0){
            for (i = 0; i < 10; i++) {
                System.out.println("Qual o valor");
                v[i] = key.nextInt();
                temp = v[i];
            }
        }
        i = 1;
        tela[0] = v[0];
        System.out.print(tela[0] + " ");
        
        while (i != 10){
            if (tela[j] != v[i]) {
                tela[j] = v[i];
                System.out.print(tela[j] + " ");
                j++;
            }
            i++;
        }
    }
}
