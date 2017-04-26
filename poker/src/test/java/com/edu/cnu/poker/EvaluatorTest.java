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
                new Card(3,Suit.CLUBS),
                new Card(6,Suit.CLUBS),
                new Card(4,Suit.CLUBS),
                new Card(5,Suit.CLUBS));
        String result = evaluator.evaluate(cardList);
        assertThat(result,is("FLUSH"));
    }

    @Test
    public void SUIT가_5개같고_10_J_Q_K_A면_로티플이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(10,Suit.CLUBS),
                new Card(11,Suit.CLUBS),
                new Card(12,Suit.CLUBS),
                new Card(13,Suit.CLUBS),
                new Card(1,Suit.CLUBS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("RTF"));
    }

    @Test
    public void SUIT가_5개같고_A_2_3_4_5면_백티플이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(2,Suit.CLUBS),
                new Card(3,Suit.CLUBS),
                new Card(4,Suit.CLUBS),
                new Card(5,Suit.CLUBS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("BTF"));
    }

    @Test
    public void SUIT가_5개같고_연속되면_스티플이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(13,Suit.CLUBS),
                new Card(12,Suit.CLUBS),
                new Card(3,Suit.CLUBS),
                new Card(2,Suit.CLUBS),
                new Card(1,Suit.CLUBS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("STF"));
    }

    @Test
    public void 같은숫자가_4개면_포카드다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(3,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(1,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("FOUR_CARD"));
    }

    @Test
    public void 같은숫자가_3개와_2개가_있으면_풀하우스다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(3,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(3,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("FULL_HOUSE"));
    }

    @Test
    public void 같은숫자2개가_2개있으면_투페어다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(3,Suit.CLUBS),
                new Card(3,Suit.HEARTS),
                new Card(2,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("TWO_PAIR"));
    }

    @Test
    public void 같은숫자2개가_1개있으면_원페어다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(3,Suit.CLUBS),
                new Card(4,Suit.HEARTS),
                new Card(5,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("ONE_PAIR"));
    }

    @Test
    public void 같은숫자3개가_있으면_트리플이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(3,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(2,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("TRIPLE"));
    }

    @Test
    public void 모든무늬가_같지않지만_10부터A까지_있으면_마운틴이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(10,Suit.CLUBS),
                new Card(11,Suit.SPADES),
                new Card(12,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(13,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("MOUNTAIN"));
    }

    @Test
    public void 모든무늬가_같지않지만_A부터5까지_있으면_백스트레이트이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(4,Suit.CLUBS),
                new Card(5,Suit.SPADES),
                new Card(3,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(2,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("BACK_STRAIGHT"));
    }

    @Test
    public void 모든무늬가_같지않지만_카드5장이연달아있으면_스트레이트이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(2,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(13,Suit.CLUBS),
                new Card(12,Suit.HEARTS),
                new Card(11,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("STRAIGHT"));
    }

    @Test
    public void 다섯장의카드로_위의경우어디에도_해당하지않는경우_노페어(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(3,Suit.CLUBS),
                new Card(1,Suit.SPADES),
                new Card(5,Suit.CLUBS),
                new Card(7,Suit.HEARTS),
                new Card(9,Suit.DIAMONDS));
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("NOPAIR"));
    }
}