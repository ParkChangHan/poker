package com.edu.cnu.poker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by user on 2017-04-17.
 */
public class EvaluatorTest {

    @Test
    public void SUIT가_5개동일하면_플러쉬다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.CLUBS));
        String result = evaluator.evaluate(cardList);
        assertThat(result,is("FLUSH"));
    }
}