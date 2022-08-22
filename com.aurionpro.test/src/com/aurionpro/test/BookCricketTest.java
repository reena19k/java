package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model*;
public class BookCricketTest {
    public static void main(String[] args) {
        Player player1=  new Player();
        Player player2 = new Player();

        BookCricket bkc = new BookCricket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player1 name");
        player1.setName(sc.next());

        System .out.println("Enter player2 name");
        player2.setName(sc.next());

        System.out.println("Enter 1 To Start The Game and 0 for exit:  ");
        int start = sc.nextInt();
        if (start == 1){
            System.out.println("player " + player1.getName());
            bkc.playGame(player1);
            System.out.println("Target for player 2 is "+(player1.getScore()+1));
            System.out.println("player " + player2.getName());
            bkc.playGame(player2);
            result(player1,player2);

        }else{
            System.out.println("EXIT");
        }


    }
      public static void result(Player p,Player q){
        if (p.getScore() > q.getScore()) {
            System.out.println("player 1 Wins the game");
        } else if (p.getScore() == q.getScore()) {
            if(p.getRound()<q.getRound()){
                System.out.println("Player 1 wins the game ");
            }else if(p.getRound()>q.getRound()){
                System.out.println("Player 2 wins the game");
            }else {
                System.out.println("game tied!!");
            }
        } else {
            System.out.println("Player 2 wins the game");
        }
    }
}