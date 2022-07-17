package ordemcres;

import java.util.Scanner;

public class OrdemCres {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        int a, b, c;
        
        a = key.nextInt();
        b =  key.nextInt();
        c = key.nextInt();
        
        
        if ( a<= 0 ||  b<= 0 ||  c<= 0) {
            
            System.out.println("-");
            
        }else if((a <= b)&&(b <= c)){
            
          System.out.println(a+" "+b+" "+c);
          
        }else if ((a <= c) && (c <= b)){
            
            System.out.print(a+" "+c+" "+b);
            
        }else if ((b <= c) && (c <= a)){
            
            System.out.print(b+" "+c+" "+a);
            
        }else if ((b <= a) && (a <= c)){
            
            System.out.print(b+" "+a+" "+c);
            
        }else if ((c <= b) && (b <= a)){
            
            System.out.print(c+" "+b+" "+a);
            
        }else if ((c <= a) && (a <= b)){
            
            System.out.print(c+" "+a+" "+b);
        }
          
               
    }
    
}
