package com.java.tic_tac_toe;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // step 1 - declare the board
        char[][] board = new char[3][3];

        // step 2 - initialize the board with empty space
        initializeBoard(board);

//        step 3 - initailze some variables
        char player = 'X';
        boolean gameOver = false;
//        step 4 - run a loop until the game is over;
        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " 's move ");
//            step 5 - take the input for the cell from the user/player
            int row = input.nextInt();
            int col = input.nextInt();
            if (row < 3 && col < 3) {


//          step 6 - check wheather the cell/space is occupied or not
                if (board[row][col] == ' ') {
//          step 7 - if the space/cell is not occupied then place the players move on that particular cell
                    board[row][col] = player;
                    gameOver = haveWon(board, player);
                    if (gameOver) {
                        printBoard(board);
                        System.out.println("Congratulations - Player " + player + " Won the game");
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid Move! Please try again ");
                }
            } else {
                System.out.println("No such cell exist");
            }

        }

    }

    private static boolean haveWon(char[][] board, char player) {
        // here comes the actual winning conditions
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player
                    && board[row][1] == player
                    && board[row][2] == player) {
                return true;
            }
        }

        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player
                    && board[1][col] == player
                    && board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player
                && board[1][1] == player
                && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player
                && board[1][1] == player
                && board[2][0] == player) {
            return true;
        }

        return false;
    }

    static void initializeBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(" | " + board[row][col]);
            }
            System.out.print(" | ");
            System.out.println();
        }
        System.out.println();
    }
}