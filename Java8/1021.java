import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int notaCem =0, notaCinquenta = 0,notaVinte = 0,notaDez = 0,notaCinco = 0,notaDois = 0;
        int moedaUM = 0,moedaCinquenta = 0,moedaVinteCinco = 0,moedaDez = 0, moedaCinco = 0,moedaCentavo = 0;
        double N;

        Scanner sc = new Scanner(System.in);
        N = sc.nextDouble();
        N += 0.001;

        while(N-100>=0){
            N-=100;
            notaCem++;
        }
        while(N-50>=0){
            N-=50;
            notaCinquenta++;
        }
        while(N-20>=0){
            N-=20;
            notaVinte++;
        }
        while(N-10>=0){
            N-=10;
            notaDez++;
        }
        while(N-5>=0){
            N-=5;
            notaCinco++;
        }
        while(N-2>=0){
            N-=2;
            notaDois++;
        }
        while(N-1>=0){
            N-=1;
            moedaUM++;
        }
        while(N-0.50>=0){
            N-=0.50;
            moedaCinquenta++;
        }
        while(N-0.25>=0){
            N-=0.25;
            moedaVinteCinco++;
        }
        while(N-0.10>=0){
            N-=0.10;
            moedaDez++;
        }
        while(N-0.05>=0){
            N-=0.05;
            moedaCinco++;
        }
        while(N-0.01>=0){
            N-=0.01;
            moedaCentavo++;
        }

        System.out.println("NOTAS:");
        System.out.println(notaCem + " nota(s) de R$ 100.00");
        System.out.println(notaCinquenta +" nota(s) de R$ 50.00");
        System.out.println(notaVinte +" nota(s) de R$ 20.00");
        System.out.println(notaDez +" nota(s) de R$ 10.00");
        System.out.println(notaCinco + " nota(s) de R$ 5.00");
        System.out.println(notaDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedaUM + " moeda(s) de R$ 1.00");
        System.out.println(moedaCinquenta +" moeda(s) de R$ 0.50");
        System.out.println(moedaVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(moedaDez + " moeda(s) de R$ 0.10");
        System.out.println(moedaCinco +" moeda(s) de R$ 0.05");
        System.out.println(moedaCentavo +" moeda(s) de R$ 0.01");
    }
 
}