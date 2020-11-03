import java.util.*;
import java.io.*;

public class Everywhere {
     public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());

        for(int i=0;i<cases;i++) {
            int trips = Integer.parseInt(reader.readLine());
            HashSet<String> hset = new HashSet<String>();
            for (int j=0;j<trips;j++) {
                hset.add(reader.readLine());
            }
            System.out.println(hset.size());
        }
     }
}