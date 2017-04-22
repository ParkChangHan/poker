package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Player {
    Hand hand;
    public Player(Deck deck){
        hand = new Hand(deck,PokerType.FIVE);
    }
}
