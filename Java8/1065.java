import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
        
        int par = 0;
        
        for(int i =0; i < 5; i++) {
            int x = sc.nextInt();
            if(x % 2 == 0){
                par++;
            }
        }
        System.out.println(par + " valores pares");
    }
 }