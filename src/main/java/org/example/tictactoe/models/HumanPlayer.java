package org.example.tictactoe.models;
import lombok.Builder;


@Builder
public class HumanPlayer extends Player {

    private User user;


    public HumanPlayer(User user, Symbol symbol) {
        super(symbol);
        this.user = user;
    }

    public static Builder builder(){
        return new Builder();
    }


    @Override
    public BoardCell makeMove(Board board) {
        return null;
    }

    public static class Builder {

        private User user;

        private Symbol symbol;

        private Builder(){}

        public Builder withSymbol(Symbol symbol){
            this.symbol = symbol;
            return this;
        }

        public Builder user(User user){
            this.user = user;
            return this;
        }

        public HumanPlayer build(){
            return new HumanPlayer(this.user, this.symbol);
        }

    }
}
