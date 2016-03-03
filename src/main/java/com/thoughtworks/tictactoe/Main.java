package com.thoughtworks.tictactoe;

/**
 * Created by Adam on 3/3/16.
 */
public class Main {


    public static void main(String[] arg) {
        Board board = new Board(System.out) ;
        TicTacToe ticTacToe = new TicTacToe(board) ;
        ticTacToe.display() ;
    }

}
