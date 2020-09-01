import java.io.*;

public class DetailedDifferences{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());

        while(n-->0){
            String one = sc.readLine();
            String two = sc.readLine();
            String dif = "";
            for(int i = 0 ; i < one.length(); i++){
                if(one.charAt(i) == (two.charAt(i))){
                    dif += '.';
                } else{
                    dif += '*';
                }
            }
            dc.write(one + "\n");
            dc.write(two + "\n");
            dc.write(dif + "\n" + "\n");
        }

        sc.close();
        dc.close();
    }
}