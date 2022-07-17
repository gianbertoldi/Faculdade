package mediavetor01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaVetor01 {

    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        
        float vetNota []= new float[5];
        float soma =0, media;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Qual a nota que vai dar?");
            vetNota[i] = key.nextFloat();
            soma += vetNota [i];
        }
        media = soma/4;
        System.out.println(media);
    }
}
