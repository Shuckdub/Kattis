import java.io.*;
import java.util.*;

public class ANewAlphabet{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, String> h = new HashMap<>();
        h.put('a', "@");
        h.put('b',"8");
        h.put('c',"(");
        h.put('d',"|)");
        h.put('e',"3");
        h.put('f',"#");
        h.put('g',"6");
        h.put('h',"[-]");
        h.put('i',"|");
        h.put('j',"_|");
        h.put('k',"|<");
        h.put('l',"1");
        h.put('m',"[]\\/[]");
        h.put('n',"[]\\[]");
        h.put('o',"0");
        h.put('p',"|D");
        h.put('q',"(,)");
        h.put('r',"|Z");
        h.put('s',"$");
        h.put('t',"']['");
        h.put('u',"|_|");
        h.put('v',"\\/");
        h.put('w',"\\/\\/");
        h.put('x',"}{");
        h.put('y',"`/");
        h.put('z',"2");

        String s = sc.readLine().toLowerCase();

        for(int i = 0; i < s.length() ; i ++){
            if(h.containsKey(s.charAt(i))) System.out.print(h.get(s.charAt(i)));
            else System.out.print(s.charAt(i));
        }

        sc.close();
        dc.close();
    }
}