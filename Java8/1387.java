import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner sc = new Scanner(System.in);
        int L , R, soma;
        
        while(true) {
            
            L = sc.nextInt();
            R = sc.nextInt();
            if(L == 0 && R == 0){
              break;
            }
            soma = L + R;
            System.out.println(soma);
        } 
    }
}