import java.util.*;
import java.io.*;

public class TakeTwoStones{
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int stone = Integer.parseInt(reader.readLine());
        if (stone%2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
     }
}