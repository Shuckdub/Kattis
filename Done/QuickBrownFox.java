import java.io.*;
import java.util.*;

public class QuickBrownFox{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Character> s = new HashSet<>();
        for(int i = 0; i < 26; i++){
            s.add((char)(97 + i));
        }
        int n = Integer.parseInt(sc.readLine());
        while(n-->0){
            String input = sc.readLine().replaceAll("[^a-zA-Z]+", "").toLowerCase();
            Set<Character> output = new HashSet<>();
            output.addAll(s);
            for(int i = 0; i < input.length(); i++){
                if(output.contains(input.charAt(i))){
                    output.remove(input.charAt(i));
                }
            }
            if(output.isEmpty()){
                dc.write("pangram" + "\n");
            } else{
                dc.write("missing ");
                for(Character c : output) dc.write(c + "");
                dc.write("\n");
            }

        }
        sc.close();
        dc.close();
    }
}