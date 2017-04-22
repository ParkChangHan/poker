package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 * CARD - 1 to 13 ;; rank, suit
 * DECK
 * HAND
 * EVALUATOR
 * PLAYER
 * GAME
 */
public class PokerApplication {

    public static void main(String[] args) {
        System.out.println("Hello Poker");
        int i;

        Deck deck = new Deck(1);;
        Player p1 = new Player();
        Player p2 = new Player();
        for(i = 0; i < 5; i++){
            p1.getCard(deck.drawCard());
            p2.getCard(deck.drawCard());
        }
        p1.showCards();
        p2.showCards();

    }
}
