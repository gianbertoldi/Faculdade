package maiordedoisnum;

import java.util.Scanner;

public class MaiorDeDoisNum {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Qual o primeiro valor?");
        x = key.nextInt();
        
        System.out.println("Qual o segundo valor?");
        y = key.nextInt();
        
        if (x <= 0 || y <= 0) {
            System.out.println("inválido");
        } else if (x > y){
            System.out.println("primeiro");
        }else if (x < y) {
            System.out.println("segundo");
        }
        else {
            System.out.println("iguais");
        }
    }
    
}
