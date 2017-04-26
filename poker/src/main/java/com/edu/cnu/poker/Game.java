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
    Hand p1_hand, p2_hand;
    Player player1;
    Player player2;
    Evaluator evaluator = new Evaluator();

    public Game(PokerType pokerType){
        deck = new Deck(1);
        p1_hand = new Hand(deck,pokerType);
        p2_hand = new Hand(deck,pokerType);
        player1 = new Player(p1_hand);
        player2 = new Player(p2_hand);

        PrintStart();
        PrintPlayer(player1);
        PrintPlayer(player2);

    }

    private void PrintPlayer(Player player) {

    }

    private void PrintStart(){
        System.out.println("<<< 게임을 시작합니다 >>>");
    }

    private int priority(String a) {
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
        else
            return -1;
    }
}
