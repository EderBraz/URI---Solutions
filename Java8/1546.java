import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int K = sc.nextInt();

            for (int j = 0; j < K; j++) {

                int x = sc.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Rolien");
                        break;
                    case 2:
                        System.out.println("Naej");
                        break;
                    case 3:
                        System.out.println("Elehcim");
                        break;
                    case 4:
                        System.out.println("Odranoel");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}