import java.io.*;

public class SevenWonders{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = sc.readLine();
        int t = 0;
        int c = 0;
        int g = 0;

        for(int i = 0 ; i < s.length() ; i++){
            switch(s.charAt(i)){
                case 'T':
                    t++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'G':
                    g++;
                    break;
            }
        }
        int dif = Integer.min(Integer.min(t,c),Integer.min(c,g));
        int sum = (t*t)+(c*c)+(g*g)+(dif*7);
        dc.write(sum + "");


        sc.close();
        dc.close();
    }
}