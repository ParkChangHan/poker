package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Player {
        private int cents;
        private String name;
        private Hand myHand;

        public Player(int money, String name, Deck deck) {
            this.cents = money;
            this.name = name;
            myHand = new Hand(deck,PokerType.FIVE);
        }


}
