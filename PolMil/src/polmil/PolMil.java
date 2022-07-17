/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polmil;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class PolMil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);

        double pol, mm;
        System.out.println("Quantas polegadas deseja converter");
        pol = key.nextDouble();
        mm = pol * 25.4;
        System.out.printf("Suas Polegadas em milimetros " + mm + "mm\n");

    }

}
