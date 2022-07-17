package areadeumcirculo;

import java.util.Scanner;


public class AreaDeUmCirculo {

    public static void main(String[] args) {
       double a, r, d ;
        Scanner key = new Scanner(System.in);
        
        System.out.println("Vamos calcula uma area de um circulo \ncoloque o valor do raio: ");
        r = key.nextDouble();
        
        a = Math.PI * Math.pow(r,2);
        
        System.out.println("A area do circulo é: " + a);
    }
    
}
