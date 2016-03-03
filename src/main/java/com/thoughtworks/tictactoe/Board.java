package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 3/3/16.
 */
public class Board {

    public enum XO {
        X,
        O
    }

    private PrintStream printStream ;
    private char[] elements ;

    Board(PrintStream printStream) {
        this.printStream = printStream ;
        this.elements = new char[9] ;

        for (int i = 0; i < 9; i++) {
            elements[i] = Integer.toString(i + 1).charAt(0) ;
        }
        int i = 0 ; //for debugging, remove
    }

    public void draw() {

        StringBuilder stringBuilder = new StringBuilder() ;

        for (int i = 0; i < elements.length ; i++) {

            stringBuilder.append(elements[i]) ;
            if ((i == 2) || (i == 5)) {
                stringBuilder.append('\n') ;
                stringBuilder.append("-----") ;
                stringBuilder.append('\n') ;
                continue ;
            }
            else if (i == 8) {
                stringBuilder.append('\n') ;
                break ;
            }
            stringBuilder.append('|') ;

        }
        printStream.println(stringBuilder.toString()) ;
    }

    public void addXorO(XO xo, int location) {

    }
}
