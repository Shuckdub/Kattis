import java.io.*;

public class SumSquaredDigits{
    public static void main(String[] args) throws Exception{
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int P = Integer.parseInt(sc.readLine());
    //P amount of cases, where there in each case is a num and a base for that num.
    //Everytime there us a calculation it is the digit times itself and the num is then minused the digit and divided by the base.
    while(P-- > 0){
        String[] token = sc.readLine().split(" ");
        int base = Integer.parseInt(token[1]);
        long num = Long.parseLong(token[2]);
        long sum = 0;
        while(num > 0 ){
            int dig = (int) num % base;
            sum += dig * dig;
            num = (num - dig) / base;
        }
        dc.write(token[0] + " " + sum + "\n");
    }
    sc.close();
    dc.close();
    }
}