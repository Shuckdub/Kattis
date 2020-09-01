import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlantingTrees{
    public static void main(String[]args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(sc.readLine());

        String[] trees = sc.readLine().split(" ");
        List<Integer> list = new ArrayList<>(); 
        for(String str : trees){
            list.add(Integer.parseInt(str));
        }
        Collections.sort(list); 
        Collections.reverse(list);
        int min = 0;

        for(int i = 1; i <= trees.length; i++){
            if(list.get(i-1)+i > min){
                min = list.get(i-1)+i;
            }
        }
        dc.write((min+1) + "");

        sc.close();
        dc.close();
    }
}