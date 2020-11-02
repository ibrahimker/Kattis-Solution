import java.util.*;
import java.io.*;

public class NastyHacks {
     public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());

        for(int i=0;i<cases;i++) {
            String data = reader.readLine();
            String[] dataArr = data.split(" ");
            int revenueWithoutAdvertise = Integer.parseInt(dataArr[0]);
            int revenueWithAdvertise = Integer.parseInt(dataArr[1]);
            int advertisingCost = Integer.parseInt(dataArr[2]);

            int nettRevenue = revenueWithAdvertise - advertisingCost;

            if (nettRevenue > revenueWithoutAdvertise) {
                System.out.println("advertise");
            } else if (nettRevenue == revenueWithoutAdvertise) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
     }
}