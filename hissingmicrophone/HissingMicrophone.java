import java.util.*;
import java.io.*;

public class HissingMicrophone {
     public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        HashSet<Character> hset = new HashSet<Character>();
        for(int i=0;i<word.length();i++) {
            hset.add(word.charAt(i));
        }
        if (hset.size() != word.length()-1) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
     }
}