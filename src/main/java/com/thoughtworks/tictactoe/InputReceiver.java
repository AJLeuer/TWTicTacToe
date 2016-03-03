package com.thoughtworks.tictactoe;

import java.io.InputStream;
import java.util.Scanner;

public class InputReceiver {

    private Scanner scanner ;

    public InputReceiver(InputStream in) {
        this.scanner = new Scanner(in);
    }

    public int getInput(){
        return scanner.next().trim().charAt(0);
    }

}
