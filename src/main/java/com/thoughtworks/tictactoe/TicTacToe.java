package com.thoughtworks.tictactoe;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by Adam on 3/3/16.
 */
public class TicTacToe {

    private PrintStream printStream ;
    private Board board;
    private Player player1 ;

    TicTacToe(Board board, PrintStream printStream, InputStream inputStream) {
        this.printStream = printStream ;
        this.board = board;
        this.player1 = new Player(new InputReceiver(inputStream), board, 'X') ;
    }

    public void startGame() {
        printStream.println("Player 1: Please enter the location to place an X:") ;
        player1.makeMove();
        board.draw() ;
    }
}
