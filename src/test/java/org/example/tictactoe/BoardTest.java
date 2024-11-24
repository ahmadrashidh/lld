package org.example.tictactoe;

import org.example.tictactoe.models.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {


    @Test
    public void testCreateBoard(){
        Board board = new Board(3);
        int rowSize = board.getCells().size();
        assertEquals("If the ctor of Board called with n, it should create cells with n rows",3,rowSize);


        int colSize = board.getCells().get(0).size();
        assertEquals("If the ctor of Board called with n, it should create cells with n columns",3,colSize);
    }
}
