package com.thoughtworks.tictactoe;

import static org.mockito.Mockito.mock;

/**
 * Created by Adam on 3/3/16.
 */
public class Player {

    private InputReceiver inputReceiver ;
    private Board board;
    private final char xorO ;

    Player(InputReceiver inputReceiver, Board board, char xorO) {
        this.inputReceiver = inputReceiver ;
        this.board = board ;
        this.xorO = xorO;
    }

    public void makeMove() {
        int location = inputReceiver.getInput() ;
        board.addXorO(this.xorO, location);
    }

}
