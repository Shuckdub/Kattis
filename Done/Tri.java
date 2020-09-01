import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tri {

    private static final String FILENAME = "./Input/inputTri.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int o = Integer.parseInt(st.nextToken());

        if(n/m==o){
            System.out.println(n+"/"+m+"="+o);
        } else if(n*m==o){
            System.out.println(n+"*"+m+"="+o);
        } else if(n-m==o){
            System.out.println(n+"-"+m+"="+o);
        } else if(n+m==o) {
            System.out.println(n+"+"+m+"="+o);
        } else if(n==m/o){
            System.out.println(n+"="+m+"/"+o);
        } else if(n==m*o){
            System.out.println(n+"="+m+"*"+o);
        } else if(n==m-o){
            System.out.println(n+"="+m+"-"+o);
        } else if(n==m+o) {
            System.out.println(n+"="+m+"+"+o);
        }

        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}