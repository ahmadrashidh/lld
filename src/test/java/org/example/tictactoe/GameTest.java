package org.example.tictactoe;

import org.example.tictactoe.models.*;
import org.example.tictactoe.strategies.RandomPlayingStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GameTest {

    // don't use random numbers aka magic numbers without defining explicitly
    private static final int BOARD_SIZE = 3;

    @Test
    public void testCreateGame(){

        Game game = Game.builder()
                .withSize(BOARD_SIZE)
                .withPlayer(
                        HumanPlayer.builder()
                                .withSymbol(Symbol.X)
                                .user(new User())
                                .build())
                .withPlayer(
                        BotPlayer.builder()
                                .withSymbol(Symbol.O)
                                .level(GameLevel.EASY)
                                .withPlayingStrategy(new RandomPlayingStrategy())
                                .build())
                .build();

        assertEquals("if the game is created, it should have two players", 2, game.getPlayers().size() );

    }
}
