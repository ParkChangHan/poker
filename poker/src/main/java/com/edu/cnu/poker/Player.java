package com.edu.cnu.poker;

import java.util.List;
/**
 * Created by user on 2017-04-17.
 */
public class Player {
        private String name;

    public Hand getMyHand() {
        return myHand;
    }
    private Hand myHand;

        public Player(String name, Deck deck) {
            this.name = name;
            myHand = new Hand(deck,PokerType.FIVE);
        }
    public Card getCard(int index) {
        List<Card> cardList =myHand.getCardList();
        return cardList.get(index);
    }
}
