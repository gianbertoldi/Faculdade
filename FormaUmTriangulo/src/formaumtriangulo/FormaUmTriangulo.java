
package formaumtriangulo;

import java.util.Scanner;

public class FormaUmTriangulo {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        int x, y, z, ipo;
        
        System.out.println("Qual o valor do primeiro lado do triangulo");
        x = key.nextInt();
        
        System.out.println("Qual o valor do segundo lado do triangulo");
        y = key.nextInt();
        
        System.out.println("Qual o valor do terceiro lado do triangulo");
        z = key.nextInt();
        
        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("inválido");
        }
        else if (x == y && x == z && y == z){
            System.out.println("sim");
        }
        //2 5 3
        else if (( x < y + z) && (y < z + x) && ( z < x + y)){
            System.out.println("sim");
        }
        else{
            System.out.println("não");
        }
    }
    
}
