package mediaarit;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class MediaArit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        float a,b,c,d;
        double media;
        System.out.println("Qual a primeira nota: ");
        a = key.nextFloat();
        System.out.println("Qual a Segunda nota: ");
        b = key.nextInt();
        System.out.println("Qual a terceira nota: ");
        c = key.nextInt();
        System.out.println("Qual a quarta nota: ");
        d = key.nextInt();
        
        media = (double)(a+b+c+d)/4;
        System.out.println("O resultado da media é: " + media);
        System.out.printf(" a media é %.2f", media);
    }
    
}
