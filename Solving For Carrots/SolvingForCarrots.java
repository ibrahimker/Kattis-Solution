import java.util.*;
import java.io.*;

public class SolvingForCarrots {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String firstLine = reader.readLine();
        String[] firstLineArr = firstLine.split(" ");
        int contestant = Integer.parseInt(firstLineArr[0]);
        int problem = Integer.parseInt(firstLineArr[1]);
        System.out.println(problem);
     }
}