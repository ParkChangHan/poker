package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Game {
    Deck deck = new Deck(1);
    Player player1 = new Player(new Hand(deck), PokerType.FIVE);
    Player player2 = new Player(new Hand(deck), PokerType.FIVE);
}
