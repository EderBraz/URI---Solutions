import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Z;
        int somados = 1;
        int somaTotal = X;
        do {
            Z = sc.nextInt();
        }while(X >= Z);
    
        while(somaTotal < Z) {
            X++;
            somaTotal += X;
            somados++;
        }
        System.out.println(somados);   
    }
}