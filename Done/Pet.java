package Difficulty1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pet {
    public static void main(String[] args) {
    //something wrong
     try{
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         int a[] = new int[20];

         int newSum = 0;
         int user = 0;
         for(int i = 0 ; i < 5 ; i++) {
             int sum = 0;
             String line = br.readLine();
             String[] strs = line.trim().split("\\s+");
             for (int j = 0 ; j< 4 ; j++) {
                 a[j] =  Integer.parseInt(strs[j]);
                 sum += a[j];
             }
             if(sum > newSum){
                 newSum = sum;
                 user = i+1;
             }
         }
         System.out.println(user + " " + newSum);

     } catch (IOException e) {
         e.getStackTrace();
     }
        }
}
