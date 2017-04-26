package com.edu.cnu.poker;

/**
 * Created by user on 2017-04-17.
 */
public class Game {
    Evaluator evaluator = new Evaluator();
<<<<<<< HEAD
    Hand hand;
    Player player1, player2;


    public Game(PokerType pokerType){
        Deck deck = new Deck(1);
        hand = new Hand(deck, pokerType);
        player1 = new Player(deck, pokerType);
        player2 = new Player(deck, pokerType);

        player1.hand.getTotalCard();
        player2.hand.getTotalCard();

        int resultOfPlayer1 = PokerLevel(evaluator.evaluate(player1.hand.CardList()));
        int resultOfPlayer2 = PokerLevel(evaluator.evaluate(player2.hand.CardList()));

        System.out.println("PLYAER 1의 카드");
        System.out.println(">>> " + player1.hand.CardList());
        System.out.println("PLYAER 2의 카드");
        System.out.println(">>> " + player2.hand.CardList());
        System.out.println("-----------------<RESULT>-----------------");
        System.out.println("PLAYER 1 :" + evaluator.evaluate(player1.hand.CardList()));
        System.out.println("PLAYER 2 :" + evaluator.evaluate(player2.hand.CardList()));

        if(resultOfPlayer1 > resultOfPlayer2){
            System.out.println("WINNER IS <<<PLYAER 1>>>");
            System.out.println();
        }
        else if(resultOfPlayer1 == resultOfPlayer2){
            System.out.println("DRAW! RESTART THE GAME");
            System.out.println();
            Game game = new Game(pokerType);
        }
        else {
            System.out.println("WINNER IS <<<PLAYER 2>>>");
            System.out.println();
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


=======

    public Game(PokerType pokerType){
        Deck deck = new Deck(1);
        Player p1 = new Player(deck,pokerType);
        Player p2 = new Player(deck,pokerType);
        print(p1,pokerType);
        print(p2,pokerType);

        String player1 = evaluator.evaluate(p1.hand.getCardList());
        String player2 = evaluator.evaluate(p2.hand.getCardList());

        int p1_result = priority(player1);
        int p2_result = priority(player2);

        System.out.println("\t\tplayer1 is " +player1 + "     player2 is "+player2);
        if(p1_result < p2_result) {
            System.out.println("player1 Win!!!");
            System.out.println();
        }
        else if(p1_result > p2_result) {
            System.out.println("player2 Win!!!");
            System.out.println();
        }
        else {
            System.out.println("Draw!!! Let's Regame");
            Game game = new Game(pokerType);
        }

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

    private void print(Player player, PokerType pokerType){
        for(int i = 0 ; i < pokerType.getNumberOfCard() ; i++){
            System.out.print(player.getCard(i) + ", ");
        }
        System.out.println();
    }

//    public static void main(String[] args){
//        Game game = new Game(PokerType.FIVE);
//    }
>>>>>>> master
}

