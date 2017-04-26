package com.edu.cnu.poker;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> master
import java.util.List;

/**
 * Created by user on 2017-04-17.
 */

public class Player {
<<<<<<< HEAD
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
=======
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
>>>>>>> master
    }
}
