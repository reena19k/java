package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Players;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		// Players[] playertest = {new Players(3,"sachin",51,4000,76),new
		// Players(4,"dhoni",203,3000,80),new Players(4,"virat",167,5000,175),new
		// Players(3,"john",213,1000,180)};

		ArrayList<Players> players = new ArrayList<>();

		players.add(new Players(3, "sachin", 51, 4000, 76));
		players.add(new Players(4, "dhoni", 203, 8000, 80));
		players.add(new Players(6, "virat", 167, 5000, 175));
		players.add(new Players(3, "john", 213, 1000, 180));

		
		ClassifyPlayers p = new ClassifyPlayers(players);
		ArrayList<Players> aLister = p.getAlisters();
		ArrayList<Players> bLister = p.getBlisters();

		ArrayList<Players> cLister = p.getClisters();

		System.out.println("A lister players is");
		detailplayers(aLister);
		System.out.print("------------");

		System.out.println("B lister players is");
		detailplayers(bLister);
		System.out.print("------------");

		System.out.println("C lister players is");
		detailplayers(cLister);
		System.out.print("------------");
	}

	private static void detailplayers(ArrayList<Players> players) {
		for (Players player : players) {
			System.out.println(player);
		}

	}

}