package org.example.tictactoe.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;

    private List<Player> player = new ArrayList<>();

    private GameStatus status;

    public Game(Board board, List<Player> player, GameStatus status) {
        this.board = board;
        this.player = player;
        this.status = status;
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
}
