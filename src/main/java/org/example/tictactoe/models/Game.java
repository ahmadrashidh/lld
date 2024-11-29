package org.example.tictactoe.models;

import org.example.tictactoe.InvalidPlayersException;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Game {

    private Board board;

    private static final int PLAYER_COUNT = 2;
    private static final GameStatus DEFAULT_STATUS = GameStatus.IN_PROGRESS;

    private List<Player> player = new ArrayList<>();

    private GameStatus status;

    private Game(){

    }

    public Game(Board board, List<Player> player, GameStatus status) {
        this.board = board;
        this.player = player;
        this.status = status;
    }


    public static Builder builder(){
        return new Builder();
    }

    public List<Player> getPlayers() {
        return player;
    }

    public void start(){

    }

    public void makeMove(){

    }

    private Player checkWinner(){
        return null;
    }

    private boolean isDraw(){
        return false;
    }


    public static class Builder {

        private Game game;

        private Builder(){
            game = new Game();
        }

        public Builder withSize(int size){
            this.game.board = new Board(size);
            return this;
        }

        public Builder withPlayer(Player player){
            this.game.getPlayers().add(player);
            return this;
        }

        public Game build() throws InvalidPlayersException {
            boolean isValid = validate();

            if(!isValid){
                throw new InvalidPlayersException();
            }

            Game newGame = new Game();
            newGame.board = game.board;
            newGame.player = game.player;
            newGame.status = DEFAULT_STATUS;

            return newGame;
        }

        private boolean validate() {
            List<Player> players = game.player;
            if(players.size() != Game.PLAYER_COUNT){
                return false;
            }

            // if symbols are unique
            Set<Symbol> symbolSet = players.stream()
                    .map(Player::getSymbol)
                    .collect(Collectors.toSet());

            if(symbolSet.size() != PLAYER_COUNT){
                return false;
            }

            return true;


        }

    }
}
