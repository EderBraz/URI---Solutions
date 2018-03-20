import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner sc = new Scanner(System.in);
        
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int T3 = sc.nextInt();
        int T4 = sc.nextInt();
        int total = T1 + T2 + T3 + T4 - 3;
        
        System.out.println(total);
    }
}