package com.aurionpro.test;

import java.util.Scanner;

public class Game1{
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        boolean[][] flagArr = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                flagArr[i][j] = false;
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's start the game TIC TAC TOE.");
        System.out.print("Enter the name of Player1: ");
        String play1 = scan.nextLine();
        System.out.print("Enter the name of Player2: ");
        String play2 = scan.nextLine();

        boolean player1=true;				//switch between two player
        boolean game=true;					//  to continue playing while game bcom false

        while(game) {
            drawBoard(board);
            if (player1) {
                System.out.println(play1 + "'s Turn (X): ");
            } else {
                System.out.println(play2 + "'s Turn (O): ");
            }
            char c = '-';
            if (player1) {
                c = 'X';
            } else {
                c = 'O';
            }
            int row=0;
            int col=0;
            while (true) {										 // game should continue is player mismatches between row and col value
                System.out.print("Enter a row number (0-2) Enter a column number(0-2): ");
                row = scan.nextInt();
                col = scan.nextInt();
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Invalid position.");
                } else if (board[row][col] != '-') {
                    System.out.println("This place is already filled");
                } else {
                    break;
                }
            }
            board[row][col]=c;
            flagArr[row][col]=true;
            if (playerXHasWon(board,flagArr)) {
                System.out.println(play1 + " has won!");
                   game = false;
            } else if (playerOHasWon(board,flagArr)) {
                System.out.println(play2 + " has won!");
                   game = false;
            } else {
                if (isBoardFull(board)) {
                    System.out.println("It's a tie!");
                    game = false;
                } else {
                    player1 = !player1;			//turn shifted to player2
                }
            }

        }
        drawBoard(board);
        scan.close();
    }
    public static void drawBoard(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
            System.out.println("------");
        }
    }
    public static boolean isBoardFull(char[][] flags){
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(flags[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean playerXHasWon(char[][] arr ,boolean[][] flags){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(flags[i][0] == true && flags[i][1] == true && flags[i][2] ==true && arr[i][0]=='X' && arr[i][1]=='X'&& arr[i][2]=='X'){
                    return true;			//horizontal
                }else if(flags[0][j]== true  && flags[1][j] == true && flags[2][j]==true && arr[0][j]=='X' && arr[1][j]=='X' && arr[2][j]=='X') {
                    return true;				//vertical
                }else if(flags[0][0]==true && flags[1][1]==true && flags[2][2]==true && arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X'){
                    return true;			//diagonally
                } else if(flags[2][0]== true && flags[1][1]==true && flags[0][2]==true && arr[2][0]=='X'&& arr[1][1]=='X' &&arr[0][2]=='X') {
                    return true;
                }
            }

            }
              return false;
    }

     public static boolean playerOHasWon(char[][] arr ,boolean[][] flags){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(flags[i][0] == true && flags[i][1] == true && flags[i][2] ==true && arr[i][0]=='O' && arr[i][1]=='O'&& arr[i][2]=='O'){
                    return true;		
                }else if(flags[0][j]== true  && flags[1][j] == true && flags[2][j]==true && arr[0][j]=='O' && arr[1][j]=='O' && arr[2][j]=='O') {
                    return true;		
                }else if(flags[0][0]==true && flags[1][1]==true && flags[2][2]==true && arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O'){
                    return true;
                } else if(flags[2][0]== true && flags[1][1]==true && flags[0][2]==true && arr[2][0]=='O'&& arr[1][1]=='O' &&arr[0][2]=='O') {
                    return true;
                }
            }

            }
              return false;
    }
}