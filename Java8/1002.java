import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Double A, pi, R;
        pi = 3.14159;
        
        Scanner entrada = new Scanner(System.in);
        R = entrada.nextDouble();
        A = pi * (R * R);
        System.out.printf("A=%.4f\n", A);
    }
}