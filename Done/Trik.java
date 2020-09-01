import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Trik {
    private static final String FILENAME = "./Input/inputTrik.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        String[] st = br.readLine().split("");
        int b = 1;

        for (int i = 0; i < st.length; i++) {
            if(st[i].equals("A")){
                if(b == 1){
                    b = 2;
                } else if(b==2){
                    b = 1;
                }
            } else if (st[i].equals("B")){
                if(b == 2){
                    b = 3;
                } else if (b == 3){
                    b = 2;
                }
            } else {
                if(b==3){
                    b = 1;
                } else if (b==1){
                    b = 3;
                }
            }
        }
        System.out.println(b);

        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}