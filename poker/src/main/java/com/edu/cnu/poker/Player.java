package com.edu.cnu.poker;

import java.util.List;

/**
 * Created by user on 2017-04-17.
 */
public class Player {
    Hand hand;
    public Player(Deck deck){
        hand = new Hand(deck,PokerType.FIVE);
    }

    public Card getCard(int index) {
        List<Card> cardList = hand.getCardList();
        return cardList.get(index);
    }
}
