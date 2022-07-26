
package metadedoanterior;

import java.util.Scanner;

public class MetadeDoAnterior {

    static String telaTam(){
        return "Qual o TAMANHO do vetor";
    }
    static String telaEnt(){
        return "Qual o valor para formula?";
    }
    static int tam(int tam){
        return tam;
    }
    static double entrada(double entr){
        return entr;
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println(telaTam());
        tam(key.nextInt());
        
        System.out.println(telaEnt());
        entrada(key.nextDouble());
        
        /*if (y > 0) {
            v[0] = y;
            System.out.println("v[0] = "  + v[0]);
            if (tam > 1) {
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
        }*/
    }
}
