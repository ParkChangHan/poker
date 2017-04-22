package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Game {

    public void playerCard() {
        int i;

        Deck deck = new Deck(1);
        Player p1 = new Player();
        Player p2 = new Player();

        for (i = 0; i < 5; i++) {
            p1.getCard(deck.drawCard());
            p2.getCard(deck.drawCard());
        }
        p1.showCards();
        p2.showCards();
        System.out.println("a");
    }
    


}

