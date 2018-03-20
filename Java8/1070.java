import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int aux = 6;
        if(X % 2 == 0){
            X++;
        }
        for(int i =0; i < aux; i++){
            System.out.println(X);
            X += 2;
        }
    } 
}