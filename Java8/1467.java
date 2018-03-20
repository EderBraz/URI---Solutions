import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String valores;
        
        while((valores = in.readLine()) != null  && valores.length() != 0) {
                  
            switch (valores) {
                case "0 1 1":
                case "1 0 0":
                    System.out.println("A");
                    break;
                case "1 0 1":
                case "0 1 0":
                    System.out.println("B");
                    break;
                case "0 0 1":
                case "1 1 0":
                    System.out.println("C");
                    break;
                default:
                    System.out.println("*");
                    break;
            }
        }
        System.out.close();
    }
}