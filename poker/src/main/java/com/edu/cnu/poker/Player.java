package com.edu.cnu.poker;

import java.util.ArrayList;

/**
 * Created by user on 2017-04-17.
 */
public class Player {

    ArrayList<Card> list = new ArrayList<Card>();
    public void getCard(Card card){
        list.add(card);
    }

    public void showCards(){
        System.out.println(list);
    }
}
