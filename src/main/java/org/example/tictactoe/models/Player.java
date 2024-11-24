package org.example.tictactoe.models;

public abstract class Player {
    private Symbol symbol;

    public Player(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract BoardCell makeMove(Board board);
}
