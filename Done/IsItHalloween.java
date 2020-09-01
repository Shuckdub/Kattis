package Difficulty1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsItHalloween {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            String[] str = line.trim().split("\\s+");
            int i = Integer.parseInt(str[1]);
            if(str[0].equals("OCT")&& i == 31) System.out.println("yup");
            else if(str[0].equals("DEC")&& i == 25) System.out.println("yup");
            else System.out.println("nope");
            br.close();

        } catch (IOException e){
            e.getStackTrace();
        }

        }
}
