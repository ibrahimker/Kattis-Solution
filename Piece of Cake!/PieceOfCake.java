import java.util.*;
import java.io.*;

public class PieceOfCake {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();
        String[] dataArr = data.split(" ");
        
        double result = 0;
        double thick = 4;
        double n = Double.parseDouble(dataArr[0]);
        double h = Double.parseDouble(dataArr[1]);
        double v = Double.parseDouble(dataArr[2]);
        
        double middle = n/2;
        
        if (h < middle) {
            if (v < middle) {
                result = (n-h) * (n-v) * thick;   
            } else {
                result = (n-h) * v * thick;  
            }
        } else {
            if (v < middle) {
                result = h * (n-v) * thick;   
            } else {
                result = h * v * thick;  
            }
        }
        
        System.out.println((int)result);
     }
}