package com.edu.cnu.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-04-17.
 */
public class Hand {
    private PokerType pokerType;
    private ArrayList<Card> cardList;

    public Hand(Deck deck, PokerType pokerType) {
        this.pokerType = pokerType;
        cardList = new ArrayList<Card>();
        for(int i = 0 ; i < pokerType.getNumberOfCard(); i++){
            cardList.add(deck.drawCard());
        }
    }
<<<<<<< HEAD

    public ArrayList<Card> CardList(){
        return cardList;
    }

=======
>>>>>>> master
    public int getTotalCard() {
        return cardList.size();
    }

    public List<Card> getCardList(){
        return cardList;
    }
}
