import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Modulo{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 10;
        Set<Integer> s = new HashSet<>();
        while(n-->0){
            Integer num = (Integer.parseInt(sc.readLine()))%42;
            if(s.contains(num)){
                continue;
            } else{
                s.add(num);
            }
        }
        System.out.println(s.size());

        sc.close();
        dc.close();
    }
}