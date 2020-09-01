package Difficulty1_3;

import java.util.*;

public class DiceCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        Map<Integer,Integer>best = new TreeMap<>();
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1; j<=M ; j++){
                if(best.keySet().contains(j+i)){
                    int pre = best.get(j+i);
                    pre++;
                    best.put(j+i,pre);
                } else{
                    best.put(j+i,1);
                }
            }
        }
        List<Integer>highest = new ArrayList<>();
        Integer h = 0;

        for(Map.Entry<Integer,Integer> s : best.entrySet()){
            if(s.getValue() > h){
                h = s.getValue();
                highest.clear();
                highest.add(s.getKey());
            } else if(s.getValue().equals(h)){
                highest.add(s.getKey());
            }
        }
        for(Integer s : highest){
            System.out.println(s);
        }

    }
}
