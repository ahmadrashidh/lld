package org.example.tictactoe.models;

import lombok.Builder;
import org.example.tictactoe.strategies.PlayingStrategy;

@Builder
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

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private GameLevel level;

        private Symbol symbol;

        private PlayingStrategy playingStrategy;

        private Builder(){}

        public Builder withSymbol(Symbol symbol){
            this.symbol = symbol;
            return this;
        }

        public Builder level(GameLevel level){
            this.level = level;
            return this;
        }

        public Builder withPlayingStrategy(PlayingStrategy strategy){
            this.playingStrategy = strategy;
            return this;
        }

        public BotPlayer build(){
            return new BotPlayer(this.symbol, this.level, this.playingStrategy);
        }

    }
}
