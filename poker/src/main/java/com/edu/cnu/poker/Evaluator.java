package com.edu.cnu.poker;

import java.util.*;

/**
 * Created by user on 2017-04-17.
 */
public class Evaluator {
    Hand hand;

    public String evaluate(List<Card> cardList) {
        List<Suit> suitList = new ArrayList<Suit>();
        List<Integer> rankList = new ArrayList<Integer>();
        for(Card card : cardList){
            suitList.add(card.getSuit());
            rankList.add(card.getRank());
        }
        String result = genealogy(suitList,rankList);
        return result;
    }

    private String genealogy(List<Suit> suitList,List<Integer> rankList) {
        int Scount = 0;
        int Hcount = 0;
        int Dcount = 0;
        int Ccount = 0;
        int[] rankCount = new int[14];
        Suit S = Suit.SPADES;
        Suit H = Suit.HEARTS;
        Suit D = Suit.DIAMONDS;
        Suit C = Suit.CLUBS;

        for(Suit key : suitList){
            if(key == S) Scount++;
            else if(key == H) Hcount++;
            else if(key == D) Dcount++;
            else if(key == C) Ccount++;
        }
        for(int rank : rankList){
            rankCount[rank]++;
        }

        if(Scount == 5 || Hcount == 5 || Dcount == 5 || Ccount == 5){
            Collections.sort(rankList);
            if(rankList.get(0) == 1 && rankList.get(4) == 13) return "RTF";
            else if (rankList.get(0) == 1 && rankList.get(4) == 5) return "BTF";
            return "FLUSH";
        }

        for(int rank : rankCount){
            if(rank == 4) return "FOUR_CARD";
            if(rank == 2) {
                for (int rank_1 : rankCount) {
                    if (rank_1 == 2) return "TWO_PAIR";
                    if (rank_1 == 3) return "FULL_HOUSE";
                }
            }
        }

        return null;
    }
}
