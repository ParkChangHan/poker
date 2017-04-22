package com.edu.cnu.poker;

import java.util.ArrayList;

/**
 * Created by user on 2017-04-17.
 */
public class Player {

        private int cents;
        private String name;
        private Hand myHand;
        private boolean isBigBlind;
        private boolean isSmallBlind;

        public Player(int money, String name, Deck sharedDeck) {
            this.cents = money;
            this.name = name;
            myHand = new Hand();
        }
}
