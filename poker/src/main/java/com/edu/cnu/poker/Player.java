package com.edu.cnu.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-04-17.
 */
public class Player {
    ArrayList<Card> list = new ArrayList<Card>();
    Hand hand;

    public Player(Deck deck, PokerType pokertype){
        hand = new Hand(deck, pokertype);
    }
    public void getCard(Card card) {
        list.add(card);
    }

    public List<Card> showCards(){
        return hand.CardList();
    }
}
