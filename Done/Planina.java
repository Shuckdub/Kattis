package Difficulty1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Planina {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            int n = Integer.parseInt(br.readLine());

            int t = (int)Math.pow(2,n);

            t =(int) Math.pow((t + 1),2);

            System.out.println(t);
        } catch (IOException e){
            e.getStackTrace();
        }

    }
}
