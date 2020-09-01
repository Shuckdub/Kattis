import java.io.*;

public class Apaxiaaaaaaaaaaaans{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = sc.readLine();
        String news = "";
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                continue;
            } else{
                news += str.charAt(i);
            }
        }
        news += str.charAt(str.length()-1);
        dc.write(news);

        sc.close();
        dc.close();
    }
}