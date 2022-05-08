package org.example;

import factories.PlayerFactory;
import models.*;
import org.junit.Before;
import org.junit.Test;
import strategies.DefaultPlayingStrategy;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TicTacToeTest {
    private Game game;

    @Before
    public void setup() {
        this.game = createGame(3, 3);
    }

    private Game createGame(int rows, int cols) {
        Game game = Game
                .getBuilder()
                .withBoardDimension(3, 3)
                .withPlayer(PlayerFactory.getHumanPlayer()
                        .user(User
                                .builder()
                                .name("Tejas")
                                .emailId("tmorajkar316@gmail.com")
                                .photo("profilePic.jpg")
                                .build())
                        .symbol(GameSymbol.O)
                        .build())
                .withPlayer(PlayerFactory.getBotPlayer()
                        .playingStrategy(new DefaultPlayingStrategy())
                        .symbol(GameSymbol.X)
                        .build())
                .build();

        return game;
    }

    @Test
    public void testDimensions() {
        List<List<BoardCell>> cells = game.getBoard().getCells();
        assertEquals("should create a board with 3 rows", 3, cells.size());
        List<BoardCell> firstRow = cells.get(0);
        assertEquals("should create a board with 3 columns", 3, firstRow.size());
    }
}
