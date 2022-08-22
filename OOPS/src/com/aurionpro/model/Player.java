package com.aurionpro.model;

public class Player {
    private int score;
    private int turn=1;
    private int turnScore;


    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setTurnScore(int turnScore) {
        this.turnScore = turnScore;
    }

    public int getTurnScore() {
        return turnScore;
    }

    public void setTurn(int turn){
        this.turn=turn;
    }

    public int getTurn(){
    return turn;
    }


}