import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Inputter {

    private static final String FILENAME = "./Input/input.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

        String strCurrentLine;

        while ((strCurrentLine = br.readLine()) != null) {
            System.out.println(strCurrentLine);
        }

        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}