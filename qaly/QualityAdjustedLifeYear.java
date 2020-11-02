import java.util.*;
import java.io.*;

public class QualityAdjustedLifeYear {
     public static void main(String []args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int period = Integer.parseInt(reader.readLine());
        double qaly = 0;
        
        for (int i=0; i<period; i++) {
            String data = reader.readLine();
            String[] dataArr = data.split(" ");
            
            double qol = Double.parseDouble(dataArr[0]);
            double year = Double.parseDouble(dataArr[1]);
            qaly += (qol * year);
        }
        
        double scale = Math.pow(10, 3);
        qaly = Math.floor(qaly * scale) / scale;
        System.out.println(qaly);
     }
}