import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
        
        String entrada = sc.nextLine();
        if(entrada.length() <= 140){
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }
    }
}