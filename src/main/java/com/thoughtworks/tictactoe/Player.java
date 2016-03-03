package com.thoughtworks.tictactoe;

import java.io.InputStream;

/**
 * Created by Adam on 3/3/16.
 */
public class Player {

    private InputReceiver inputReceiver ;

    Player(InputStream in) {
        inputReceiver = new InputReceiver(in) ;
    }


}
