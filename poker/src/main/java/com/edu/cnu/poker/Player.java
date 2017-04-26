package com.edu.cnu.poker;

import lombok.Data;

/**
 * Created by user on 2017-04-17.
 */
public class Player {
    Hand hand;
    String result;

    public Player(Hand hand){
        this.hand = hand;
    }

    public int getCardListSize(){
        return hand.getCardList().size();
    }
}
