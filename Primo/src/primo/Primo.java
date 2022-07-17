/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        int a,i = 0;
        boolean  primo = true;
        System.out.println("Digite o numero que deseja saber se é primo");
        a = key.nextInt();
        
        while (i <= a){
            if (a % i == 0) {
                primo = false;
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
