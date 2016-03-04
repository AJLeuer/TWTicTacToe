package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/**
 * Created by Adam on 3/3/16.
 */
public class Board {

    private PrintStream printStream ;
    private char[] elements ;
    private ArrayList<Integer> positionsTaken ;

    Board(PrintStream printStream) {
        this.printStream = printStream ;
        this.elements = new char[9] ;
        this.positionsTaken = new ArrayList<>() ;

        for (int i = 0; i < 9; i++) {
            elements[i] = Integer.toString(i + 1).charAt(0) ;
        }
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

    public void addXorO(char xo, int position) throws IllegalArgumentException {
        if (positionIsTaken(position)) {
            throw new IllegalArgumentException() ;
        }
        positionsTaken.add(position) ;

        int index = position - 1 ;
        elements[index] = xo ;

    }

    private boolean positionIsTaken(int position) {
        if (positionsTaken.contains(position)) {
            return true ;
        }
        return false ;
    }
}
