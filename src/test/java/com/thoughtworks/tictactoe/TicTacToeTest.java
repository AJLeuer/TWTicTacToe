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
    private PrintStream printStream ;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class) ;
        ticTacToe = new TicTacToe(printStream) ;
    }

    @Test
    public void shouldDisplayBoardWhenStarting() {

        String board =  "1|2|3\n" +  "-----\n" + "4|5|6\n" + "-----\n" + "7|8|9" ;
        ticTacToe.display() ;

        verify(printStream).println(contains(board)) ;

    }
}