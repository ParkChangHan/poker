package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Game {
    Evaluator evaluator = new Evaluator();
    Hand hand;
    Player player1, player2;


    public Game(PokerType pokerType){
        Deck deck = new Deck(1);
        hand = new Hand(deck, pokerType);
        player1 = new Player(pokerType, deck);
        player2 = new Player(pokerType, deck);

        player1.hand.getTotalCard();
        player2.hand.getTotalCard();

        int resultOfPlayer1 = PokerLevel(evaluator.evaluate(player1.hand.getTotalCard()));
        int resultOfPlayer2 = PokerLevel(evaluator.evaluate(player2.hand.getTotalCard()));

        System.out.println("PLAYER 1 :" + evaluator.evaluate(player1.hand.getTotalCard()));
        System.out.println("PLAYER 2 :" + evaluator.evaluate(player1.hand.getTotalCard()));

        if(resultOfPlayer1 > resultOfPlayer2){
            System.out.println("WINNER IS <<<PLYAER 1>>>");
        }
        else if(resultOfPlayer1 == resultOfPlayer2){
            System.out.println("DRAW! RESTART THE GAME");
            Game game = new Game(pokerType);
        }
        else {
            System.out.println("WINNER IS <<<PLAYER 2>>>");
        }



    }

    private int PokerLevel(String result) {
        if (result.equals("ONE_PAIR")) return 1;
        else if (result.equals("TWO_PAIR")) return 2;
        else if (result.equals("TRIPLE")) return 3;
        else if (result.equals("STRAIGHT")) return 4;
        else if (result.equals("BACK_STRAIGHT")) return 5;
        else if (result.equals("MOUNTAIN")) return 6;
        else if (result.equals("FLUSH")) return 7;
        else if (result.equals("FULL_HOUSE")) return 8;
        else if (result.equals("FOUR_CARD")) return 9;
        else if (result.equals("STF")) return 10;
        else if (result.equals("BTF")) return 11;
        else if (result.equals("RTF")) return 12;
        return 0;
    }


}

