package com.aurionpro.model;
import java.util.Scanner;
public class BookCricket {
    Book book = new Book();
    Scanner sc = new Scanner(System.in);

    public void playGame(Player p) {
        int pageNum = 0;
        int point = 1;
        int count = 0;
        int score=0;
        while (point!=0) {
            System.out.println("Press 1 to Enter Open Book");
            int key = sc.nextInt();
            if (key == 1) {
                pageNum = book.getPageNum();
            } else {
                System.out.println("Game is terminated Exitt!!!");
            }
            point = (pageNum) % 7;
            score= point + score;
            p.setScore(score);
            count++;
            p.setRound(count);
            System.out.println("Page Number " + pageNum + " Point " + point + " Score " + p.getScore());
            }
        }


    }