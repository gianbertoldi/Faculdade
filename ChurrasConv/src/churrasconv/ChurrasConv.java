/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churrasconv;

import java.text.DecimalFormat;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Gian
 */
public class ChurrasConv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        double homem, mulher,crianca,carH,carM,carC,totalG,kg;
        System.out.println("Vamos se preparar para o churras");
        System.out.println("Quantos homens viram?");
        homem = key.nextInt();
        carH = 650 * homem;
        System.out.println("Quantas mulheres viram?");
        mulher = key.nextInt();
        carM = 420 * mulher;
        System.out.println("E as crianças, quantas são?");
        crianca = key.nextInt();
        carC = 290 * crianca;
        
        totalG = carC + carH + carM;
        kg = totalG/1000;
        
        System.out.println("Voce precisa de " + dec.format(kg) + " Kilos de carne");
    
    }
    
}
