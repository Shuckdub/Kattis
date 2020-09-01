import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Inputter {

    private static final String FILENAME = "./Input/inputTri.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

        StringTokenizer st = new StringTokenizer(br.readLine());

        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}