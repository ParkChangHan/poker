package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Game {
    private Deck theDeck;
    private boolean isGameOver;

    public Game(int numberOfDeck) {
        theDeck = new Deck(numberOfDeck);
        isGameOver = false;
    }
}