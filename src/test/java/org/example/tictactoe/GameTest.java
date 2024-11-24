package org.example.tictactoe;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Game;
import org.junit.Test;

public class GameTest {

    // don't use random numbers aka magic numbers without defining explicitly
    private static final int BOARD_SIZE = 3;

    @Test
    public void testCreateGame(){
        Board board = new Board(BOARD_SIZE);
    }
}
