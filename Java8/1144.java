import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
   Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int linha = N;
        if(N > 1 && N < 1000){
            for(int i = 1; i <= linha; i++) {
               System.out.print(i + " ");
               System.out.print(i*i + " ");
               System.out.println(i*i*i);
               System.out.print(i + " ");
               System.out.print(i*i+1 + " ");
                System.out.println(i*i*i+1);
            }   
        }
    }
}