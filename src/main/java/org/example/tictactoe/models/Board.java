package org.example.tictactoe.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private int size;
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int size) {
        this.size = size;
        this.cells = initCells(size);
    }

    public int getSize() {
        return size;
    }

    public Board setSize(int size) {
        this.size = size;
        return this;
    }

    public List<List<BoardCell>> getCells() {
        return cells;
    }

    public Board setCells(List<List<BoardCell>> cells) {
        this.cells = cells;
        return this;
    }

    private List<List<BoardCell>> initCells(int size) {
        List<BoardCell> oneRow = Collections.nCopies(size, new BoardCell());
        return Collections.nCopies(size, oneRow);
    }
}
