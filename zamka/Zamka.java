// import java.util.*;
// import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Zamka {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        
        int n = 0;
        int m = 0;
        
        for (int i=l;i<=d;i++) {
            int candidate = sumOfDigit(i);
            if (candidate == x) {
                // set n if not exists
                if (n == 0) {
                    n = i;
                }
                m = i;
            }
        }
        
        System.out.println(n);
        System.out.println(m);
     }
     
     public static int sumOfDigit(int in) {
        int sum = 0;
        while (in != 0)
            {
            sum += (in % 10);
            in /= 10;
            }
        
        return sum;
    }
}