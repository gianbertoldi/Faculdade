/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediacinval;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class MediaCinVal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat dec = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        
         double nt1,nt2,nt3,nt4,nt5,contador = 0,media;
         
         System.out.println("Coloque os valores das notas em orden e aperte enter entre cada uma delas:");
         System.out.println("Nota 1: ");
         nt1 = key.nextDouble();
         contador++;
         System.out.println("nota 2");
         nt2 = key.nextDouble();
         contador++;
         System.out.println("nota 3");
         nt3 = key.nextDouble();
         contador++;
         System.out.println("nota 4");
         nt4 = key.nextDouble();
         contador++;
         System.out.println("nota 5");
         nt5 = key.nextDouble();
         contador++;
         
         media = (nt1 + nt2 + nt3 + nt4 + nt5)/contador;
         
         System.out.println("A media é: " + dec.format(media));
    }
    
}
