import java.io.*;
import java.util.Arrays;

public class PhoneList{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(sc.readLine());

        while(t-->0){
            int n = Integer.parseInt(sc.readLine());
            String[] input = new String[n];
            for(int i = 0 ; i < n ; i++){
                input[i] = sc.readLine();
            }
            Arrays.sort(input);
            boolean y = false;
            for(int i = 1 ; i < n ; i++){
                if(input[i].startsWith(input[i-1])){
                    y = true;
                    break;
                } else{
                    continue;
                }
            }
            if(y){
                dc.write("NO" + "\n");
            } else{
                dc.write("YES" + "\n");
            }
        }

        sc.close();
        dc.close();
    }
}