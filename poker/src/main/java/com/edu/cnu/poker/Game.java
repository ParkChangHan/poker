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
        System.out.println("게임을 시작합니다");
        Evaluator evaluator1 = new Evaluator();
        List<Card> cardList1 = player1.getHand().getCardList();
        String result1 = evaluator1.evaluate(cardList1);
        Evaluator evaluator2 = new Evaluator();
        List<Card> cardList2 = player2.getHand().getCardList();
        String result2 = evaluator1.evaluate(cardList2);
        int first = this.priority(result1);
        int second = this.priority(result2);

        if(first > second){
            System.out.println("player1이 이겼습니다");
        }
        else if(first < second){
            System.out.println("player2가 이겼습니다");
        }
        else
            System.out.println("비겼습니다");
    }

    public int priority(String a) {
        if (a == "MOUNTAIN")
            return 6;
        else if (a == "BACK_STRAIGHT")
            return 5;
        else if (a == "STF")
            return 10;
        else if (a == "STRAIGHT")
            return 4;
        else if (a == "RTF")
            return 12;
        else if (a == "BTF")
            return 11;
        else if (a == "FLUSH")
            return 7;
        else if (a == "FOUR_CARD")
            return 9;
        else if (a == "TWO_PAIR")
            return 2;
        else if (a == "FULL_HOUSE")
            return 8;
        else if (a == "ONE_PAIR")
            return 1;
        else if (a == "TRIPLE")
            return 3;
        else if (a == "FLUSH")
            return 0;
        else
            return -1;
    }
}
