import java.util.*;
import java.io.*;

public class HeartRate {
    public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());
        for(int i=0;i<cases;i++) {
            String data = reader.readLine();
            String[] dataArr = data.split(" ");
            int b = Integer.parseInt(dataArr[0]);
            double p = Double.parseDouble(dataArr[1]);

            double bpm = (60*b)/p;
            double noise = (60/p);
            double minAbpm = bpm-noise;
            double maxAbpm = bpm+noise;
            System.out.printf("%.4f %.4f %.4f\n",minAbpm,bpm,maxAbpm);
        }
    }
}