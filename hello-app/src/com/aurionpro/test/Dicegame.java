package com.aurionpro.test;

import java.util.*;
import java.util.Random;
public class Dicegame {

        public static void main(String[] args) {
            System.out.println("PIG DICE GAME");
            System.out.println("* See how many turns it takes you to get to 20");
            System.out.println("* Turn ends when you hold or roll a 1");
            System.out.println("* If you roll a 1, you lose all points for the turn");
            System.out.println("* If you hold, you save all points for the turn\n");

            int finalscore = 0, turns = 1, turnScore = 0;			//finalscore is totalscore, turns is changing the new turn, turnscore is every turn score
            Scanner sc = new Scanner(System.in);
            System.out.println("TURN " + turns );

            while (finalscore < 20) {
                System.out.print("Roll or hold? (r/h): ");
                char s = sc.next().charAt(0);
                int totalScore = 0;		//to make each turn score 0 if 1 encounter

                if (s == 'r') {
                    Random random = new Random();
                    int die = 1 + random.nextInt(6);
                    if (die != 1) {
                        System.out.println("Die: " + die);

                        turnScore = turnScore + die;
                        totalScore = finalscore + turnScore;
                        if (turnScore >= 20 || totalScore >= 20) {
                            if (totalScore >= 20) {
                                System.out.println("Total score: " + totalScore + "\n");
                            } else {
                                System.out.println("Total score: " + turnScore + "\n");
                            }
                            System.out.println("You finished in " + turns + " turns!\n");
                            System.out.println("Game Over!");
                            break;
                        }
                    } else {				//if die generate 1
                        turnScore = 0;
                        System.out.println("Die: " + die);
                        System.out.println("Turn Over, No Score.\n");
                        turns++;
                        System.out.println( "TURN " + turns );
                    }

                }
                else if (s == 'h') {
                    finalscore = finalscore + turnScore;
                    if (finalscore >= 20) {
                        System.out.println("Total score: " + finalscore + "\n");
                        System.out.println("You finished in " + turns + " turns!\n");
                        System.out.println("Game Over!");
                        break;
                    } else {
                        System.out.println("Score for turn " + turns + ": " + turnScore);
                        System.out.println("Total Score: " + finalscore + "\n");
                        turns++;
                        System.out.println("TURN " + turns);
                        turnScore = 0;
                    }
                }

                else {
                    System.out.println("Enter r or h only");
                }

            }
            sc.close();
        }

    }