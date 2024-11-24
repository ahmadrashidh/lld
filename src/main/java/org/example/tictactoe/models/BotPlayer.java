package org.example.tictactoe.models;

import org.example.tictactoe.strategies.PlayingStrategy;

public class BotPlayer extends Player {

    private GameLevel level;
    private PlayingStrategy playingStrategy;

    public BotPlayer(Symbol symbol, GameLevel level, PlayingStrategy playingStrategy) {
        super(symbol);
        this.level = level;
        this.playingStrategy = playingStrategy;
    }

    @Override
    public BoardCell makeMove(Board board) {
        return playingStrategy.makeMove(board);
    }
}