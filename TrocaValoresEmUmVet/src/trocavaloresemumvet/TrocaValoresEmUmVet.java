package trocavaloresemumvet;

import java.util.Random;
import java.util.Scanner;

public class TrocaValoresEmUmVet {

    public static void main(String[] args) {
        Scanner key =  new Scanner(System.in);
        Random ger = new Random();
        int v[] =  new int[20],temp,i,j;
        
        for (i = 0; i < 20; i++) {
            v[i] = ger.nextInt(21);
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        i = 0;
        j = 19;
        
        while(j > i){
            temp = v[i];
            v[i] = v[j];
            v[j] = temp;
            i++;
            j--;
        }
        
        for (i = 0; i < 20; i++) {
            System.out.print(" " + v[i]);
        }
    }
}
