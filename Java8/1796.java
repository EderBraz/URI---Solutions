import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int Q = sc.nextInt();
        int Y = 0;
        int N = 0;
        
        for(int i = 0; i < Q; i++){
            int L = sc.nextInt();
            
            if(L == 0){
                Y++;
            }
            if(L == 1){
                N++;
            }
        }
        if(Y > N){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}