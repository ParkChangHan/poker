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
        Game game = new Game(PokerType.FIVE);
    }
}
