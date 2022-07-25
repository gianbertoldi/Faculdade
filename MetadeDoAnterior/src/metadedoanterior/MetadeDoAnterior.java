
package metadedoanterior;

import java.util.Scanner;

public class MetadeDoAnterior {

    private static int x;
    private static int y;
    
    static int tam(int x){
        Scanner key = new Scanner(System.in);
        x = key.nextInt();
        return x;
    }
    static int ent(int y){
        Scanner key = new Scanner(System.in);
        y = key.nextInt();
        return y;
    }
    static double cond (double vet){
        int ini, cont = 2;
        ini = tam(x);
        double vetor;
        vetor = ent(y);
        double v[] = new double[ini],temp = 0;
        
        if (vetor > 0) {
            System.out.println("v[0] = "  + v[0]);
            if (ini > 1) {
                for (int i = 1; i != (ini - 1); i++) {
                    if (v[0] == vetor) {
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
        } else { 
            System.out.println("-");
        }
        return vet;
    }    
    
    public static void main(String[] args) {
        System.out.println("Qual o TAMANHO do vetor");
        System.out.println("Qual o valor para formula?"); 
        //String tela = cond(vet);
    }
    
}
