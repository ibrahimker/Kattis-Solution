import java.util.*;
import java.io.*;

public class HissingMicrophone {
     public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        System.out.println(word.contains("ss") ? "hiss" : "no hiss");
     }
}