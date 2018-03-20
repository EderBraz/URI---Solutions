import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
        int vGremio = 0;
        int vInter = 0;
        int empate = 0;
        int opcao;
        int grenais = 0;
        
        do {
            grenais++;
            int golInter = sc.nextInt();
            int golGremio = sc.nextInt();
            if(golInter > golGremio){
                vInter++;
            }else if(golGremio > golInter) {
                vGremio++;
            } else {
                empate++;
            }
           
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();
        } while (opcao == 1);
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vInter);
        System.out.println("Gremio:" + vGremio);
        System.out.println("Empates:" + empate);
        
        if(vInter > vGremio){
            System.out.println("Inter venceu mais");
        } else if(vGremio > vInter) {
            System.out.println("Gremio venceu mais");
        } else  {
            System.out.println("Nao houve vencedor");
        }
    }
}