package com.edu.cnu.poker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by KOSEOKKYU on 2017-04-23.
 */
public class GameTest {
    @Test
    public void 게임시작은_지금부터(){
        Deck deck = new Deck(1);
        Hand hand1 = new Hand(deck, PokerType.FIVE);
        Hand hand2 = new Hand(deck, PokerType.FIVE);
        Player player1 = new Player(hand1);
        Player player2 = new Player(hand2);
        Game game = new Game(deck, player1, player2);
        game.start();
//        assertThat(hand.getTotalCard(),is(5));
    }
}
