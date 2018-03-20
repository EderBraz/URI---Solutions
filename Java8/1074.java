import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X;
        
        for(int i = 0; i < N; i++){
            X = sc.nextInt();
            if(X == 0) {
                System.out.println("NULL");
            } else if(X % 2 == 0){
                if(X > 0){
                System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else{
                if(X > 0) {
                System.out.println("ODD POSITIVE");
            } else {
                    System.out.println("ODD NEGATIVE");
                }
            }     
        } 
    }
 
}