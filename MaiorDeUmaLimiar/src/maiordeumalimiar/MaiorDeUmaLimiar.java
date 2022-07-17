
package maiordeumalimiar;

import java.util.Scanner;

public class MaiorDeUmaLimiar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        int x;
        
        System.out.println("Informe o valor a ser comparado");
        x = key.nextInt();
        
        if (x >= 100) {
            System.out.println("sim");
        }
        else {
            System.out.println("não");
        }
    }
    
}
