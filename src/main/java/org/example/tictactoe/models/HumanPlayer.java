package org.example.tictactoe.models;

public class HumanPlayer extends Player {

    private User user;

    public HumanPlayer(User user, Symbol symbol) {
        super(symbol);
        this.user = user;
    }


    @Override
    public BoardCell makeMove(Board board) {
        return null;
    }
}
