package exemodulooitoum;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExeModuloOitoUm {

        static double condicao(int x, double y){
        Scanner key = new Scanner(System.in);
        
        int cont = 2;
        System.out.println("Qual o TAMANHO do vetor");
        x =  key.nextInt();
        
        double v[] = new double[x],ini, temp =0;
        System.out.println("Qual o valor para formula?");
        y = key.nextDouble();
        
        if (y > 0) {
            v[0] = y;
            System.out.println("v[0] = "  + v[0]);
            if (x > 1) {
                for (int i = 1; i != (x - 1); i++) {
                    if (v[0] == y) {
                        v[i] = v[0]/2;
                        v[0] = -2;
                        System.out.println("v[1] = " + v[i]);
                        temp = v[i];
                    }
                v[i] = temp/2;
                temp = v[i];
                System.out.println("v[" + cont + "] = " + v[i]);
                cont++;
                }
            }
            
        }else{
            System.out.println("-");
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        
        
    }
    
}

