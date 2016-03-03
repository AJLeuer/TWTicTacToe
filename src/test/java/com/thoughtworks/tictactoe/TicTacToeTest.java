package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Adam on 3/3/16.
 */
public class TicTacToeTest {

    private TicTacToe ticTacToe ;
    private Board board ;
    private PrintStream printStream ;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class) ;
        board = mock(Board.class) ;
        ticTacToe = new TicTacToe(board, printStream, System.in) ;
    }

    @Test
    public void shouldTellBoardToDisplayWhenStarting() {
        ticTacToe.startGame() ;

        verify(board).draw();
    }
}