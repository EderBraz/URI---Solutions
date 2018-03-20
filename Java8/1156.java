import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double fracao, S = 1, i = 3, j = 2;
       
        while(i <=39){
           fracao = i/j;
           S +=fracao;
           i+=2;
           j*=2;   
        }
        System.out.printf("%.2f\n", S);
    }
}