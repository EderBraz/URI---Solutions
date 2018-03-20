import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int X = 60, Y = 90, distancia;
        Scanner sc = new Scanner(System.in);
        distancia = sc.nextInt();
        
        System.out.println(distancia * 2 + " minutos");
 
    } 
}