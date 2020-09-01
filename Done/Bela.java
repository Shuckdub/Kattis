import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bela{
    private static final String FILENAME = "./Input/inputBela.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        n *=4;
        String s = st.nextToken();

        String[][] numbers = {
            {"A","K","Q","J","T","9","8","7"},
            {"11","4","3","20","10","14","0","0"},
            {"11","4","3","2","10","0","0","0"}
        };

        int sum = 0;

        for(int i = 0; i < n; i++) {
            String ns = br.readLine();
            String number = ns.substring(0, 1);
            String suit = ns.substring(1, 2);
            for (int j = 0; j < 8; j++) {
                if(numbers[0][j].equals(number)){
                    if(suit.equals(s)){
                        sum += Integer.parseInt(numbers[1][j]);
                    } else{
                        sum += Integer.parseInt(numbers[2][j]);
                    }
                    break;
                }
            }
        }
        System.out.println(sum);

        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}