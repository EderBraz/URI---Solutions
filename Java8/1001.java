import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int A, B, SOMA;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        
    }
 
}