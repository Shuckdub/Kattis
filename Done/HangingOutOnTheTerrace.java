import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HangingOutOnTheTerrace {
    private static final String FILENAME = "./Input/inputHangingOutOnTheTerrace.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int sum = 0;
        int pr = 0;

        for (int i = 0; i < x ; i++) {
            st = new StringTokenizer(br.readLine());
            int temp;
            if(st.nextToken().equals("enter")){
                temp = Integer.parseInt(st.nextToken());
                if(sum+temp <= l){
                    sum += temp;
                } else {
                    pr++;
                }
            } else {
                temp = Integer.parseInt(st.nextToken());
                if(sum-temp > 0){
                    sum -= temp;
                } else {
                    sum = 0;
                }
                
            }
        }
        System.out.println(pr);

        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}