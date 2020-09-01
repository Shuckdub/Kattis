import java.io.*;

public class JudgingMoose{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = sc.readLine().split(" ");
        int l = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);

        if(l == 0 && r == 0){
            dc.write("Not a moose");
        } else if(l == r){
            dc.write("Even " + (l*2));
        } else if(l < r){
            dc.write("Odd " + (r*2));
        } else {
            dc.write("Odd " + (l*2));
        }
        

        sc.close();
        dc.close();
    }
}