import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = 0;

        while (N != 0) {
            
            int  X = 0, Y = 0;
            for(int i = 0; i < N; i++) {
                R = sc.nextInt();

                if (R == 0) {
                    X++;
                } else if (R == 1) {
                    Y++;
                }         
            } // fim for
            
            System.out.println("Mary won " + X + " times and John won " + Y + " times");
            N = sc.nextInt();
        } // fim while
    }
}