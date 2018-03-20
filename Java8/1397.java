import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N != 0) {
            
            int pontosA = 0, pontosB = 0;
            
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int B = sc.nextInt();

                if (A > B) {
                    pontosA++;
                } else if (B > A) {
                    pontosB++;
                }
            }//fim for
            System.out.println(pontosA +" " + pontosB);
            N = sc.nextInt();
        }// fim while
    }
}