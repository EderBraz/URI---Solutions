import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int multi2 = 0, multi3 = 0, multi4 = 0, multi5 = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            if (L % 2 == 0) {
                multi2++;
                if (L % 4 == 0) {
                    multi4++;
                }
            }
            if (L % 3 == 0) {
                multi3++;
            }
            if (L % 5 == 0) {
                multi5++;
            }
        }
        System.out.println(multi2 + " Multiplo(s) de 2");
        System.out.println(multi3 + " Multiplo(s) de 3");
        System.out.println(multi4 + " Multiplo(s) de 4");
        System.out.println(multi5 + " Multiplo(s) de 5");
    }
}