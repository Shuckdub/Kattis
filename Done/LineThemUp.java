import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineThemUp{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());
        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();
        while(n-->0){
            s.add(sc.readLine());
        }
        t.addAll(s);
        Collections.sort(t);
        boolean z = false;
        if(t.equals(s)){
            dc.write("INCREASING");
            z = true;
        }
        Collections.sort(t,Collections.reverseOrder());
        if(t.equals(s)){
            dc.write("DECREASING");
        } else if(!z){
            dc.write("NEITHER");
        }
        sc.close();
        dc.close();
    }
}