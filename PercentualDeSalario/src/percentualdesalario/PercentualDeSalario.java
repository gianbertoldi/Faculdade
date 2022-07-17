/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentualdesalario;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class PercentualDeSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        float salario = 0.00f, reajuste, valSoma = 0.00f,salFinal = 0.00f;
        
        System.out.println("Qual o salario atual do funcionario?");
        salario = key.nextFloat();
        System.out.println("Qual a percentual de reajuste? ");
        reajuste = key.nextFloat();
        
        valSoma = (salario * reajuste)/100;
        salFinal = salario + valSoma;
        
        System.out.println("O salario apos o reajuste é de: " + salFinal);
    }
    
}
