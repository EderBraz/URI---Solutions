import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        PrintStream out = new PrintStream(System.out);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int N = Integer.parseInt(in.readLine());
        String  resultado;
        int t1, t2V, t2, t1V;
        int time1, time2;
        
        for(int i = 0; i < N; i++){
            
            time1 = 0;
            time2 = 0;
            resultado = in.readLine();
            
            t1 = Character.getNumericValue(resultado.charAt(0));//casa
            t2V = Character.getNumericValue(resultado.charAt(4));//visitante
            
            resultado = in.readLine();
            t2 = Character.getNumericValue(resultado.charAt(0));//casa
            t1V = Character.getNumericValue(resultado.charAt(4));//visitante
            
            time1 = t1 + t1V;
            time2 = t2V + t2;
            
            if(time1 > time2)
                out.println("Time 1");
            else if(time1 == time2 && t1V > t2V)
                out.println("Time 1");
            else if(time1 == time2 && t1 == t2 && t2V == t1V)
                out.println("Penaltis");
            else
                out.println("Time 2");
        }     
    }
}