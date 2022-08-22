package com.aurionpro.model;

import java.util.ArrayList;

public class ClassifyPlayers {

	public ArrayList<Players> players;

	public ClassifyPlayers(ArrayList<Players> players) {
		
		this.players = players;
	}

	public ArrayList<Players> getAlisters() {

		ArrayList<Players> playerA = new ArrayList<>();

		for (Players player : players) {

			if (validatePlayerA(player)) {
				playerA.add(player);
			}

		}
		return playerA;
	}

	public ArrayList<Players> getBlisters() {

		ArrayList<Players> playerB = new ArrayList<>();

		for (Players player : players) {

			if (validatePlayerB(player)) {
				playerB.add(player);
			}

		}
		return playerB;
	}

	public ArrayList<Players> getClisters() {

		ArrayList<Players> playerC = new ArrayList<>();

		for (Players player : players) {

			if (validatePlayerC(player)) {
				playerC.add(player);
			}

		}
		return playerC;
	}


	private boolean validatePlayerC(Players player) {
		if (player.getMatches() < 50 && player.getPlayerId() < 3000 || player.getWickets() < 75) {
			return true;
		}
		return false;
	}

	private boolean validatePlayerB(Players player) {
		if (player.getMatches() > 50 && (player.getPlayerId() > 3000 && player.getWickets()  < 5000)
				|| (player.getPlayerId() > 75 && player.getPlayerId() < 150)) {
			return true;
		}

		return false;
	}

	private boolean validatePlayerA(Players player) {
		if (player.getMatches() > 100 && player.getPlayerId() > 5000 || player.getWickets() > 150) {
			return true;
		}
		return false;
	}

}