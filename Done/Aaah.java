import java.io.*;

public class Aaah{
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        String jon = sc.readLine();
        String doctor = sc.readLine();

        if(jon.length() < doctor.length()){
            System.out.println("no");
        } else{
            System.out.println("go");
        }
        sc.close();
        dc.close();
    }
}