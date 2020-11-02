import java.util.*;
import java.io.*;

public class NoDuplicates {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();
        String[] dataArr = data.split(" ");
        
        TreeSet<String> trie = new TreeSet<>();
        
        for(int i=0;i<dataArr.length;i++) {
            if (trie.contains(dataArr[i])) {
                System.out.println("no");
                return;
            } else {
                trie.add(dataArr[i]);
            } 
        }
        
        System.out.println("yes");  
     }
}