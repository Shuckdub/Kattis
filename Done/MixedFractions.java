import java.io.*;
import java.util.*;

public class MixedFractions{
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] nums = sc.readLine().split(" ");
            int numerator = Integer.parseInt(nums[0]);
            int denominator = Integer.parseInt(nums[1]);

            if(numerator == 0 && denominator == 0){
                break;
            } else if(numerator/denominator < 0){
                dc.write("0" + numerator + " / " + denominator + "\n");
            } else{
                int i = numerator/denominator;
                int l = numerator%denominator;
                dc.write(i + " " + l + " / " + denominator + "\n");
            }
        }
        sc.close();
        dc.close();
    }
}