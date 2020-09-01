import java.io.*;

public class QuickEstimate{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());

        while(n-- > 0){
            String s = sc.readLine();
            dc.write(s.length() + "" + "\n");
        }

        sc.close();
        dc.close();
    }
}