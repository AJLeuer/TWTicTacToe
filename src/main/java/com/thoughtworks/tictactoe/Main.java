package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by Adam on 3/3/16.
 */
public class Main {


    public static void main(String[] arg) {
        PrintStream gamePrintStream = System.out ;

        Board board = new Board(gamePrintStream) ;
        TicTacToe ticTacToe = new TicTacToe(board, gamePrintStream, System.in) ;

        ticTacToe.startGame() ;
    }

}
