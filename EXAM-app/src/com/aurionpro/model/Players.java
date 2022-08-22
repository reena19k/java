package com.aurionpro.model;

public class Players {
	private int playerId;
	private String playerName;
	private int matches;
	private int runs;
	private int wickets;

	public Players(int playerId, String playerName, int matches, int runs, int wickets) {

		this.playerId = playerId;
		this.playerName = playerName;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getMatches() {
		return matches;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", matches=" + matches + ", runs="
				+ runs + ", wickets=" + wickets + "]";
	}

}
