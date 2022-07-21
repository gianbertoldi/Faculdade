package somadedoisvetores;

import java.util.Scanner;

public class SomaDeDoisVetores {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int  cont = 1, i = 0,j = 0,x = 0, tela = 0, tam = 3;
        int vUm[] = new int[3],vDois[] = new int[3],vSoma[] = new int[3];
        
        
        for (i = 0; i != tam; i++) {
            System.out.println("Qual o valor " + cont + " do PRIMEIRO vetor");
            vUm[i] = key.nextInt();
            cont++;
        }
        i = 0;
        cont = 1; 
        for (j = 0; j != tam; j++) {
            System.out.println("Qual o valor " + cont + " do SEGUNDO vetor");
            vDois[j] = key.nextInt();
            cont++;
        }
        i = 0; 
        j = 0;
        System.out.print("Os valores do vetor 1 => ");
        for (tela = 0; tela < tam; tela++) {
            System.out.print(vUm[i] + " ");
            i++;
            j++;
        }
        System.out.println("");
        i = 0; 
        j = 0;
        tela = 0; 
        System.out.print("Os valores do vetor 2 => ");
        for (tela = 0; tela < tam; tela++) {
            System.out.print(vDois[j] + " ");
            i++;
            j++;
        }
        i = 0; 
        j = 0;
        System.out.println("");
        System.out.print("A soma dos vetores é => ");
        while (x != tam){
            vSoma[x] = vUm[i] + vDois[j];
            i++;
            j++;
            System.out.print(vSoma[x] + " ");
            x++;
        }
    }
}
