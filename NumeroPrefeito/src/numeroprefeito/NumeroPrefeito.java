package numeroprefeito;

import java.util.Scanner;

public class NumeroPrefeito {

    public static void main(String[] args) {
        Scanner key =  new Scanner(System.in);
        int num,temp,soma = 0;
        boolean perfeito = false;
        System.out.println("Digite o numero que deseja saber se é perfeito");
        num = key.nextInt();
        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
                soma = soma + i;
                
            }
            
        }
        if (soma == num) {
            perfeito = true;
        }
        if (perfeito) {
            System.out.println("O numero é perfeito");
        }
        else{
            System.out.println("Não");
        }
    }
    
}
