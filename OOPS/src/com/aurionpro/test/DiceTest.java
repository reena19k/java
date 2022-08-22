package com.aurionpro.test;

import com.aurionpro.model.*;

public class DiceTest {
	public static void main(String[] args) {
		System.out.println("PIG DICE GAME");
		System.out.println("* See how many turns it takes you to get to 20");
		System.out.println("* Turn ends when you hold or roll a 1");
		System.out.println("* If you roll a 1, you lose all points for the turn");
		System.out.println("* If you hold, you save all points for the turn\n");
		Dice d1 = new Dice();
		Player player = new Player();
		while (player.getScore() + player.getTurnScore() < 20) {
			d1.playPigGame(player);
		}
		System.out.println("you have completed in " + (player.getTurn()) + "Your total score is" +(player.getScore()+player.getTurnScore()));

	}
}