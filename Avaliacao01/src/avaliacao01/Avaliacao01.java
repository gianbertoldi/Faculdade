package avaliacao01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Avaliacao01 {
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        double armazem[] = new double[4];
        double totalArmaz;
        int selecaoGrao = 5;
        int grao[] = new int[5];
        
        while(selecaoGrao != 0){
            System.out.println("Escolha um valor de 1 a 4");
            selecaoGrao = key.nextInt();
            
            switch (selecaoGrao) {
                case 1:
                    System.out.println("Qunatas toneladas de trigo serão add?");
                    grao[0] = grao[1];
                    grao[1] = key.nextInt();
                    grao[1] += grao[0];
                    
                    break;
                case 2:
                    System.out.println("Qunatas toneladas de Arros serão add?");
                    grao[0] = grao[2];
                    grao[2] = key.nextInt();
                    grao[2] += grao[0];
                    break;
                case 3:
                    System.out.println("Qunatas toneladas de cevada serão add?");
                    grao[0] = grao[3];
                    grao[3] = key.nextInt();
                    grao[3] += grao[0];
                    break;
                case 4:
                    System.out.println("Qunatas toneladas de milho serão add?");
                    grao[0] = grao[4];
                    grao[4] = key.nextInt();
                    grao[4] += grao[0];
                    break;
            }        
        }
        totalArmaz = grao[1]+grao[2]+grao[3]+grao[4];
        armazem[0] = (grao[1]*100)/totalArmaz;
        armazem[1] = (grao[2]*100)/totalArmaz;
        armazem[2] = (grao[3]*100)/totalArmaz;
        armazem[3] = (grao[4]*100)/totalArmaz;
        
       System.out.println("1 " + grao[1] + " " + dec.format(armazem[0]));
       System.out.println("2 " + grao[2] + " " + dec.format(armazem[1]));
       System.out.println("3 " + grao[3] + " " + dec.format(armazem[2]));
       System.out.println("4 " + grao[4] + " " + dec.format(armazem[3]));
    }
    
}
