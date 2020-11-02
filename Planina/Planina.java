import java.util.*;
import java.io.*;

public class Planina {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        // (2^(n) +1)^2
        int a = (int) Math.pow(2,number) + 1;
        int result = (int) Math.pow(a,2);
        System.out.println(result);
     }
}