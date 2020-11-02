import java.util.*;
import java.io.*;

public class R2 {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String firstLine = reader.readLine();
        String[] firstLineArr = firstLine.split(" ");
        int r1 = Integer.parseInt(firstLineArr[0]);
        int mean = Integer.parseInt(firstLineArr[1]);
        int r2 = 2*(mean) - r1;
        System.out.println(r2);
     }
}