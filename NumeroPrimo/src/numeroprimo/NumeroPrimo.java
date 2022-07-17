
package numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static boolean main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a,i = 0;
        boolean  primo= false;
        System.out.println("Digite o numero que deseja saber se é primo");
        a = key.nextInt();
        
        while (i <= a){
            if (i%a == 0) {
                primo = true;
            }
            i++;
        }
        if (primo == true) {
            System.out.println("sim");
        }else {
            System.out.println("não");
        }
        
       
            
    }
}
    
    

