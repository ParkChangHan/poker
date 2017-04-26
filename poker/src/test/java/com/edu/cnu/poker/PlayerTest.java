package com.edu.cnu.poker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
<<<<<<< HEAD
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by user on 2017-04-23.
 */
public class PlayerTest {
    @Test
    public void Player가_받은_카드의_수는_5이다(){
        Deck deck = new Deck(1);
        Player player = new Player(deck,PokerType.FIVE);
        assertThat(player.hand.getTotalCard(), is(5));
    }
}
=======
import static org.junit.Assert.*;

/**
 * Created by user on 2017-04-22.
 */
public class PlayerTest {
    @Test
    public void Player가_PokerType을_FIVE로받으면_Player는_5장의카드가있다(){
        Deck deck = new Deck(1);
        Player player = new Player(deck,PokerType.FIVE);
        int result = player.getCardList();
        assertThat(result,is(5));
    }

    @Test
    public void Player가_PokerType을_SEVEN으로받으면_Player는_7장의카드가있다(){
        Deck deck = new Deck(1);
        Player player = new Player(deck,PokerType.SEVEN);
        int result = player.getCardList();
        assertThat(result,is(7));
    }
}
>>>>>>> master
