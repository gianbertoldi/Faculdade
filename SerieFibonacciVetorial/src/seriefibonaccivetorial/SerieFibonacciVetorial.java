package seriefibonaccivetorial;

public class SerieFibonacciVetorial {

    public static void main(String[] args) {
        int serie[] = new int[10];
        serie[0] = 0;
        serie[1] = 1;
        System.out.print(serie[0] + " " + serie[1]);
        for (int i = 2; i != 10; ++i) {
            serie[i] = serie[i-1] + serie[i-2];
            
            System.out.print(" " + serie[i]);
        }
    }
}
