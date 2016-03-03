package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
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
        ticTacToe = new TicTacToe(board) ;
    }

    @Test
    public void shouldDisplayBoardWhenStarting() {
        ticTacToe.display() ;

        verify(board).draw();
    }
}