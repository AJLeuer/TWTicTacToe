package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by Adam on 3/3/16.
 */
public class TicTacToeTest {

    private TicTacToe ticTacToe ;
    private Board board ;
    private PrintStream printStream ;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class) ;
        board = mock(Board.class) ;
        player1 = mock(Player.class) ;
        player2 = mock(Player.class) ;
        ticTacToe = new TicTacToe(board, printStream, player1, player2) ;
    }

    @Test
    public void shouldTellBoardToDisplayWhenStarting() {
        ticTacToe.startGame() ;

        verify(board, times(2)).draw();
    }

    @Test
    public void shouldAskUserForDifferentLocationIfAlreadyTaken() {
        board = new Board(printStream) ; //not sure we can mock this and still have it work
        ticTacToe = new TicTacToe(board, printStream, player1, player2) ;
        ticTacToe.startGame();

        //todo ask Bill how to do this
        //when(player1.makeMove()).then(board.addXorO('X', 2)) ;
        //when(player2.makeMove()).then(board.addXorO('O', 2)) ;

        verify(printStream).println(contains("Location already taken. Please try again.")) ;
    }

}