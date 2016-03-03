package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Adam on 3/3/16.
 */
public class PlayerTest {

    private Player player ;
    InputReceiver inputReceiver ;
    Board board ;

    @Before
    public void setUp() throws Exception {
        inputReceiver = mock(InputReceiver.class) ;
        board = mock(Board.class) ;
        player = new Player(inputReceiver, board, Board.XO.X) ;
    }

    @Test
    public void shouldAddXorOToCorrectLocationWhenUserEntersNumber() {

        when(inputReceiver.getInput()).thenReturn(1) ;

        player.makeMove() ;

        verify(board).addXorO(Board.XO.X, 1) ;
    }

}