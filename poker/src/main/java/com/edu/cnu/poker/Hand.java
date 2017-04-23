package com.edu.cnu.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-04-17.
 */
public class Hand {

    private Deck deck;
    private PokerType pokerType;
    private ArrayList<Card> cardList;

    public Hand(Deck deck, PokerType pokerType) {
        this.deck = deck;
        this.pokerType = pokerType;
        cardList = new ArrayList<Card>();
        for(int i = 0 ; i < pokerType.getNumberOfCard(); i++){
            cardList.add(deck.drawCard());
        }
    }

    public ArrayList<Card> CardList(){
        return cardList;
    }

    public int getTotalCard() {
        return cardList.size();
    }
}
