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
        if(Scount != 5 && Hcount != 5 && Dcount != 5 && Ccount != 5) {
            Collections.sort(rankList);
            if (rankList.get(0) == 1 && rankList.get(1) == 10 && rankList.get(2) == 11 && rankList.get(3) == 12 && rankList.get(4) == 13) {
                return "MOUNTAIN";
            }
            if (rankList.get(0) == 1 && rankList.get(1) == 2 && rankList.get(2) == 3 && rankList.get(3) == 4 && rankList.get(4) == 5) {
                return "BACK_STRAIGHT";
            }
        }
        if(Scount != 5 && Hcount != 5 && Dcount != 5 && Ccount != 5) {
            Collections.sort(rankList);
            int i = 0;
            int exception = 0;
            for(int j = 0; j<5; j++){
                if(rankList.get(j) > 10){
                    exception = rankList.get(j);
                    break;
                }
            }
            while((rankList.get(i)+1 == rankList.get(i+1)) || (rankList.get(i)+9 == exception)){
                if(exception != 0) {
                    if (rankList.get(i) < 11 && rankList.get(i + 1) < 11) {
                        if ((exception - rankList.get(i) < 9) && (exception - rankList.get(i+1) < 9)) {
                            break;
                        }
                    }
                }
                i++;
                if(i == 4){
                    return "STRAIGHT";
                }
            }
        }
        if(Scount == 5 || Hcount == 5 || Dcount == 5 || Ccount == 5) {
            Collections.sort(rankList);
            int i = 0;
            int exception = 0;
            for(int j = 0; j<5; j++){
                if(rankList.get(j) > 10){
                    exception = rankList.get(j);
                    break;
                }
            }
            while((rankList.get(i)+1 == rankList.get(i+1)) || (rankList.get(i)+9 == exception)){
                if(rankList.get(i) <11 && rankList.get(i+1) <11){
                    if((exception - rankList.get(i) < 9) && (exception - rankList.get(i) < 9)){
                        break;
                    }
               }
                    i++;
                if(i == 4){
                    return "STF";
                }
            }
        }

        if(Scount == 5 || Hcount == 5 || Dcount == 5 || Ccount == 5){
            Collections.sort(rankList);
            if(rankList.get(0) == 1 && rankList.get(4) == 13) return "RTF";
            else if (rankList.get(0) == 1 && rankList.get(4) == 5) return "BTF";
            return "FLUSH";
        }

        for(int i = 1 ; i < 14 ; i++) {
            if (rankCount[i] == 4) return "FOUR_CARD";
            else if (rankCount[i] == 2) {
                for (int j = 1; j < 14; j++) {
                    if (rankCount[j] == 2 && i != j) return "TWO_PAIR";
                    if (rankCount[j] == 3) return "FULL_HOUSE";
                }
                return "ONE_PAIR";
            } else if (rankCount[i] == 3) {
                for (int j = 1; j < 14; j++) {
                    if (rankCount[j] == 2) return "FULL_HOUSE";
                }
                return "TRIPLE";
            }
        }
            return "NO_PAIR";
    }
}
