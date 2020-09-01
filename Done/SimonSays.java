import java.io.*;

public class SimonSays{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());
        while(n-- > 0){
            String[] s = sc.readLine().split(" ");
            if(s[0].equals("Simon") && s[1].equals("says")){
                for(int i = 2 ; i < s.length; i++){
                    dc.write(s[i] + " ");
                }
                dc.write("\n");
            }
            
        }

        sc.close();
        dc.close();
    }
}