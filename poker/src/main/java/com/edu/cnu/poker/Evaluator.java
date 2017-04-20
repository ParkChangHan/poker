package com.edu.cnu.poker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017-04-17.
 */
public class Evaluator {
    Hand hand;

    public String evaluate(List<Card> cardList) {
        Map<Suit,Integer> map = new HashMap<Suit,Integer>();
        for(Card card : cardList){
            if(map.containsKey(card.getSuit())){
                int count = map.get(card.getSuit());
                map.put(card.getSuit(),++count);
            }
            else map.put(card.getSuit(),1);
        }

        for(Suit key : map.keySet()){
            if(map.get(key) == 5){
                return "FLUSH";
            }
        }
        return null;
    }
}
