package projdeentesai;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProjDeEntESai {

    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        
        double infla = 7.45;
        
       
        System.out.println("Projeto HW");
        System.out.println("Hello World");
        System.out.println("\n============================\n");
        
        System.out.println("Momento atual fomartado");
        System.out.printf("a inflação de " + data.format(now) +" é de " + infla);
        System.out.println("\n============================\n");
        
        System.out.println("Comandos de entrada");
        double x;
        
        System.out.println("Digite a variavel double que deseja printar");
        x = key.nextDouble();
        
        System.out.println("Voce escreveu a variavel: " + deci.format(x));
        
        
       
        
       
       
       
       
        
    }
    
}
