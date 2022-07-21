
package testeleiturasemrepeticao;

import java.util.Scanner;

public class TesteLeituraSemRepeticao {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int cons = 1, contador = 1;
        int valor[] = new int[11];
        
        for (int i = 1; i != 11; i++) {
            while(cons == 0){
                cons = key.nextInt();
                valor[i] = cons;
                System.out.println(valor[i]);
            }
        }
    }
    
}
