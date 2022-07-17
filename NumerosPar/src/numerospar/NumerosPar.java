package numerospar;
public class NumerosPar {
    
    public static void main(String[] args) {
        int a = 10,b = 20, c;
        a++;
        b--;
        for (c = a; c <= b; c++) {
            if (c%2 == 0) {
                System.out.println("pares são: " + c);
                
            }
        } 
        
    
      
    }
    
}
