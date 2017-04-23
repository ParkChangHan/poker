package com.edu.cnu.poker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
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