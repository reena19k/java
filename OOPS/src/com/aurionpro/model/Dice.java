package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public int getDice() {
		return 1 + new Random().nextInt(6);
	}

	public void playPigGame(Player p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Turn " + p.getTurn());
		System.out.println("Roll or Hold ? r/h : ");
		char s = sc.next().charAt(0);
		if (s == 'r') {
			roll(p);
		} else if (s == 'h') {
			hold(p);
		} else {
			System.out.println("Enter r or h only");

		}
	}

	public void roll(Player pl) {
		int dice = getDice();
		System.out.println("Die : " + dice);
		if (dice == 1) {
			System.out.println("Turn Over !!");
			pl.setTurnScore(0);
			pl.setTurn(pl.getTurn() + 1);
		} else {
			pl.setTurnScore(pl.getTurnScore() + dice);
		}
	}

	public void hold(Player pl) {
		pl.setScore(pl.getScore() + pl.getTurnScore());
		System.out.println("Turn score: " + pl.getTurnScore());
		System.out.println("Total score " + pl.getScore());
		pl.setTurnScore(0);
		pl.setTurn(pl.getTurn() + 1);
	}

}