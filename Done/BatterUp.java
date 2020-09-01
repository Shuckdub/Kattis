import java.io.*;

public class BatterUp{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());
        String[] s = sc.readLine().split(" ");
        int num = 0;
        double de = 0.0;
        for(int i = 0 ; i < s.length;i++ ){
            if(Integer.parseInt(s[i]) != -1){
                num += Integer.parseInt(s[i]);
                de++;
            }
        }
        double sum = num/de;
        dc.write(sum + "");

        sc.close();
        dc.close();
    }
}