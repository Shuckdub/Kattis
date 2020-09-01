import java.io.*;
import java.util.*;

public class Cd{
    public static void main(String[] args) throws Exception{
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
    while(true){
        Set<Integer> in = new HashSet<Integer>();
        String[] amount = sc.readLine().split(" ");
        int jack = Integer.parseInt(amount[0]);
        int jill = Integer.parseInt(amount[1]);
        if(jack == 0 && jill == 0){
            break;
        } else{
            for(int i = jack; i > 0 ; i--){
                in.add(Integer.parseInt(sc.readLine()));
            }

            int num = 0;
            for(int j = jill; j > 0 ; j--){
                if(in.contains(Integer.parseInt(sc.readLine()))){
                    num++;
                }
            }
            System.out.println(num);
            }
        }
    }
}