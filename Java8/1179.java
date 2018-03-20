import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
        int valor;
        int j = 0, k = 0;
        int[] par = new int[5];
        int[] impar = new int[5];

        for (int i = 0; i < 15; i++) {

            valor = sc.nextInt();

            if (valor % 2 == 0) {
                par[j] = valor;
                j++;
                if (j > 4) {
                    for (j = 0; j < 5; j++) {
                        System.out.println("par["+ j + "] = " + par[j]);
                    }
                    j = 0;
                }
            } else {
                impar[k] = valor;
                k++;
                if (k > 4) {
                    for (k = 0; k < 5; k++) {
                        System.out.println("impar["+ k + "] = " + impar[k]);
                    }
                    k = 0;
                }
            }
        }
        
        int aux = k;
        k = 0;
       
        while (k < aux) {
            System.out.println("impar["+ k + "] = " + impar[k]);
            k++;
        }
        
        aux = j;
        j = 0;
       while(j < aux) {
            System.out.println("par["+ j + "] = " + par[j]);
            j++;
        }   
    }
}