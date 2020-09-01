import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Acm{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        List<String> correct = new ArrayList<>();
        Map<String,Integer>attempts = new HashMap<>();

        while(true){
            String[] line = sc.readLine().split(" ");
            if(Integer.parseInt(line[0]) == -1){
                break;
            } else if(line[2].equals("right")){
                if(!correct.contains(line[1])){
                    correct.add(line[1]);
                    sum += Integer.parseInt(line[0]);
                }
            } else{
                if(attempts.containsKey(line[1])){
                    int value = attempts.get(line[1]);
                    attempts.put(line[1], value+1);
                }else{
                    attempts.put(line[1], 1);
                }
            }
        }
        for(String c : correct){
            if(attempts.containsKey(c)){
                sum += (attempts.get(c)*20);
            }
        }
        dc.write(correct.size() + " " + sum);
        sc.close();
        dc.close();
    }
}