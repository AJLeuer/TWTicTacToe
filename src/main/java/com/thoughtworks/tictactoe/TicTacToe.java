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
    private Player player2 ;
    boolean gameInProgress = false ;

    public TicTacToe(Board board, PrintStream printStream, InputStream inputStream) {
        this.printStream = printStream ;
        this.board = board;
        this.player1 = new Player(new InputReceiver(inputStream), board, 'X') ;
        this.player2 = new Player(new InputReceiver(inputStream), board, 'O') ;
    }

    //for testing only
    public TicTacToe(Board board, PrintStream printStream, Player player1, Player player2) {
        this.printStream = printStream ;
        this.board = board;
        this.player1 = player1 ;
        this.player2 = player2 ;
    }

    public void startGame() {
        gameInProgress = true ;

        while (gameInProgress) {
            printStream.println("Player 1: Please enter the location to place an X:") ;
            getPlayerResponse(player1);
            board.draw() ;

            printStream.println("Player 2: Please enter the location to place an O:") ;
            getPlayerResponse(player2) ;
            board.draw();
        }

    }

    private void getPlayerResponse(Player player) {
        boolean invalidInput = true ;

        while (invalidInput) {
            try {
                player.makeMove();
                invalidInput = false ;
            }
            catch (IllegalArgumentException e) {
                printStream.println("Location already taken. Please try again.") ;
            }
        }
    }
}
