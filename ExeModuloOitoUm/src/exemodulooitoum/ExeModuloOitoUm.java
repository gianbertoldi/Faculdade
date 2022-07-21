package exemodulooitoum;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExeModuloOitoUm {

    public static void main(String[] args) {
        DecimalFormat dec =  new DecimalFormat("0.0000");
        Scanner key = new Scanner(System.in);
        
        int x,cont = 2;
        System.out.println("Qual o TAMANHO do vetor");
        x =  key.nextInt();
        double v[] = new double[x],y, temp =0;
        System.out.println("Qual o valor para formula?");
        y = key.nextDouble();
        if (y > 0) {
            v[0] = y;
            System.out.println("v[0] = "  + dec.format(v[0]));
            if (x > 1) {
                for (int i = 1; i != (x - 1); i++) {
                    if (v[0] == y) {
                        v[i] = v[0]/2;
                        v[0] = -2;
                        System.out.println("v[1] = " + dec.format(v[i]));
                        temp = v[i];
                    }
                v[i] = temp/2;
                temp = v[i];
                System.out.println("v[" + cont + "] = " + dec.format(v[i]));
                cont++;
                }
            }
            
        }else{
            System.out.println("-");
        }
    }
}
