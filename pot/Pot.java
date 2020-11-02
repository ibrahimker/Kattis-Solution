import java.util.*;
import java.io.*;

public class Pot {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i=0; i<number; i++) {
            String data = reader.readLine();
            int n = Integer.parseInt(data.substring(0,data.length()-1));
            int pow = Integer.parseInt(data.substring(data.length()-1,data.length()));
            result += Math.pow(n,pow);
        }
        System.out.println(result);
     }
}