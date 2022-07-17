
package vetordiafimmes;

public class VetorDiaFimMes {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Des"};
        int fim[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < mes.length; i++) {
            for (int ano = 0; ano%4 == 0; ano++) {
                
            }
            System.out.println("O mes " + mes[i] + " termiona com o dia " + fim[i]);
            
        }
    }
    
}
