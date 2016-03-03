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
public class BoardTest {

    private Board board ;
    private PrintStream printStream ;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class) ;
        board = new Board(printStream) ;
    }

    @Test
    public void shouldDisplayCorrectlyWhenStarting() {

        String expectedOutput =  "1|2|3\n" +  "-----\n" + "4|5|6\n" + "-----\n" + "7|8|9" ;
        board.draw();

        verify(printStream).println(contains(expectedOutput)) ;

    }

    @Test
    public void shouldUpdateBoardDisplayWhenXorOAdded() {

        board.addXorO('X', 6) ;
        String expectedOutput =  "1|2|3\n" +  "-----\n" + "4|5|X\n" + "-----\n" + "7|8|9" ;

        board.draw();

        verify(printStream).println(contains(expectedOutput)) ;
    }
}