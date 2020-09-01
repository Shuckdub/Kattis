import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Cups{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Double,String> out = new TreeMap<>();
        for(int i = 0; i < n ; i++){
            if(sc.hasNextInt()){
                Double y = (sc.nextInt())/2.0;
                String q = sc.next();
                out.put(y,q);
            } else {
                String s = sc.next();
                Double z = sc.nextInt()*1.0;
                out.put(z,s);
            }
        }
        for(String in : out.values()){
            System.out.println(in);
        }
    }
}