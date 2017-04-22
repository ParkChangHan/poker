package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public enum PokerType {
    FIVE(5),
    SEVEN(7);

    private int numberOfCard;

    PokerType(int numberOfCard){
        this.numberOfCard = numberOfCard;
    }

    public int getNumberOfCard(){ return numberOfCard;
    }
}
