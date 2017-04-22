package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Game {
    public Game(PokerType pokerType) {
        Deck deck = new Deck(1);
        Player p1 = new Player("Kim", deck);
        Player p2 = new Player("Ko", deck);
        print(p1, pokerType);
        print(p2, pokerType);
    }
    private void print(Player player, PokerType pokerType){
        for(int i = 0 ; i < pokerType.getNumberOfCard() ; i++){
            System.out.print(player.getCard(i) + ", ");
        }
        System.out.println();
    }

    private int priority(String level){
        if(level.equals("RTF")) return 1;
        else if(level.equals("BTF")) return 2;
        else if(level.equals("STF")) return 3;
        else if(level.equals("FOUR_CARD")) return 4;
        else if(level.equals("FULL_HOUSE")) return 5;
        else if(level.equals("FLUSH")) return 6;
        else if(level.equals("MOUNTAIN")) return 7;
        else if(level.equals("BACK_STRAIGHT")) return 8;
        else if(level.equals("STRAIGHT")) return 9;
        else if(level.equals("TRIPLE")) return 10;
        else if(level.equals("TWO_PAIR")) return 11;
        else if(level.equals("ONE_PAIR")) return 12;
        return 13;
    }


    public static void main(String[] args){

     }
}
