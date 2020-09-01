import java.io.*;

public class Pot{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(sc.readLine());
        long sum = 0;
        while(n-- >0){
            long num = Long.parseLong(sc.readLine());
            long i = num%10;
            long temp = num/ 10;
            sum += Math.pow(temp, i);
        }
        System.out.println(sum);
        sc.close();
        dc.close();
    }
}