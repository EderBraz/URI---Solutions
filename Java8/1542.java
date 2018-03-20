import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int Q;

        while ((Q = sc.nextInt()) != 0) {

            int D = sc.nextInt();
            int P = sc.nextInt();
            int paginas = (int) (D * P * Q) / (P - Q);

            if (paginas == 1) {
                System.out.println(paginas + " pagina");
            } else {
                System.out.println(paginas + " paginas");
            }
        }
    }
}