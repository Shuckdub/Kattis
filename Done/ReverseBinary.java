import java.io.*;

public class ReverseBinary{
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        //Converts the int into binary
        String n = Integer.toBinaryString(Integer.parseInt(sc.readLine()));
        
        //Reverses the binary number
        StringBuilder inp = new StringBuilder();
        inp.append(n);
        inp = inp.reverse();
        
        //Converts it into a new number
        int out = Integer.parseInt(inp.toString(), 2);
        System.out.println(out);
    }
}