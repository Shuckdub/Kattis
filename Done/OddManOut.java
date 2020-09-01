import java.io.*;
import java.util.*;

public class OddManOut{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());
        int cases = 0;
        while(cases++ < n){
            int g = Integer.parseInt(sc.readLine());
            String[] c = sc.readLine().split(" ");
            Set<String> more = new HashSet<>();
            
            for(int i = 0; i < g ; i++){
                for(int z = i+1 ; z < g ; z++){
                    if(c[i].equals(c[z])){ 
                        more.add(c[i]);
                    }
                }
            }
            for(int j = 0; j < g ; j++){
                if(more.contains(c[j])){
                    continue;
                } else{
                    System.out.print("Case #" + cases + ": " + c[j] + "\n");
                }
            }
             
        }

        sc.close();
        dc.close();
    }
}