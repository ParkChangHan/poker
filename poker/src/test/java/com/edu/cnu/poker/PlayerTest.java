package com.edu.cnu.poker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by user on 2017-04-23.
 */
public class PlayerTest {
    @Test
    public void Player가_받은_카드의_수는_5이다(){
        Deck deck = new Deck(1);
        Player player = new Player(PokerType.FIVE, deck);
        assertThat(player.hand.getTotalCard(), is(5));
    }
}
