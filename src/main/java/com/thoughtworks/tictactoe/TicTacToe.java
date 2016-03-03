package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by Adam on 3/3/16.
 */
public class TicTacToe {

    public enum Mark {
        X('x'),
        O('o') ;

        private final char value ;
        private Mark(char c) { this.value = c ; }
    }

    //private PrintStream printStream ;
    private Board board;

    TicTacToe(Board board) {
        this.board = board;
    }

    public void display() {
        board.draw() ;
    }
}
