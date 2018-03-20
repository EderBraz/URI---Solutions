import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double[] N = new double[100];
              
        double X = sc.nextDouble();
        N[0] = X;
                
        for(int i = 0; i < N.length; i++) {
            if(i == 0){
                N[0] = X;
            } else {
            N[i] = N[i-1]/2;
            }
            System.out.printf("N[%d] = %.4f\n",i, N[i]);          
        } 
    }
}