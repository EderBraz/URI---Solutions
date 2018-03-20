import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x, y;
        
        for(int i = 1; i <= N; i++) {
            int soma = 0;
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x > y) {
                for ( int j = x - 1; j > y; j--) {
                    if(j % 2 != 0) {
                        soma +=j;
                    } 
                 }     
            } else if (x < y) {
                 for(int j = x+1; j < y; j++){
                     if(j % 2 != 0) {
                         soma+=j;
                     } 
                    }
            } else {
                        soma = 0;
              }
             System.out.println(soma);
        } 
    }
}