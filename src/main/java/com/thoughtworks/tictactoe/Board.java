package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by Adam on 3/3/16.
 */
public class Board {

    private PrintStream printStream ;

    Board(PrintStream printStream) {
        this.printStream = printStream ;
    }

    public void draw() {
        printStream.println("1|2|3\n" +  "-----\n" + "4|5|6\n" + "-----\n" + "7|8|9" ) ;
    }
}
