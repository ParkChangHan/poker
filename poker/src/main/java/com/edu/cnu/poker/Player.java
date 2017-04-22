package com.edu.cnu.poker;

import java.util.List;

/**
 * Created by user on 2017-04-17.
 */
public class Player {
    Hand hand;
    public Player(Deck deck, PokerType pokerType){
        hand = new Hand(deck,pokerType);
    }

    public Card getCard(int index) {
        List<Card> cardList = hand.getCardList();
        return cardList.get(index);
    }

    public int getCardList(){
        return hand.getCardList().size();
    }
}
