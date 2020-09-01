package Difficulty1_2;

import java.util.*;

public class PokerHand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String,Integer> hand = new HashMap<>();
        int strength = 0;
        for (int i = 1 ; i <= 5 ; i++){
            String nextItem = s.next();
            nextItem = nextItem.substring(0,1);
            Integer j = hand.get(nextItem);
            hand.put(nextItem, j==null ? 1 : j + 1);
            if(hand.get(nextItem) > strength){
                strength = hand.get(nextItem);
            }
        }
        System.out.println(strength);
    }
}
