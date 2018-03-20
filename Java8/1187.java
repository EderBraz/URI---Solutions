import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double[][] M = new double[12][12];
        char O = sc.next().charAt(0);
        int j = 0;
        int k = 0;
        double soma = 0;
        
        //preencher matriz
         for (int i = 0; i < M.length; i++) {
            for (j = 0; j < M.length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }
        
         //soma
        for (int i = 0; i < 5; i++) {
            for (j = i + 1; j < 12 - i - 1; j++) {
                soma += M[i][j];
            }
        }
        
        if (O == 'S') {
            System.out.printf("%.1f\n", soma);
        }
        if (O == 'M') {
            System.out.printf("%.1f\n", soma/30);
        }
    }
}