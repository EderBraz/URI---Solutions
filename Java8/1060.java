import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        
        for(int i = 0; i < 6; i++){
           double N = sc.nextDouble();
            if(N>0){
                positivo++;
            }
        }      
        System.out.println(positivo + " valores positivos");
    }
}