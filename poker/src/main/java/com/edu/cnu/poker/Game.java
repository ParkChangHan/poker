package com.edu.cnu.poker;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by user on 2017-04-17.
 */
public class Game {
    Deck deck;
    Player player1;
    Player player2;

    public Game(Deck deck, Player player1, Player player2){
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList();
        for(int i=0; i<5; i++){
            cardList.add(new Card())
        }
        String result = evaluator.evaluate(cardList);
        assertThat(result,is("FLUSH"));
    }
}
