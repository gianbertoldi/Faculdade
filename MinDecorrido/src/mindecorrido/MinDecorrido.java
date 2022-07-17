/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindecorrido;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class MinDecorrido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        int hora,min,sec, horaMin,minSec, totalSec;
        
        System.out.println("Quantas horas se passou?");
        hora = key.nextInt();
        
        System.out.println("Quantos min se passaram");
        min = key.nextInt();
        
        System.out.println("Quantos segundos se passaram");
        sec = key.nextInt();
        
        horaMin = (hora * 60) + min;
        
        minSec = (min  * 60) + horaMin;
        
        totalSec = minSec + sec;
        
        
        
        
        System.out.println("O total de segundo passado foram de: " + totalSec);
        
        
    }
    
}
