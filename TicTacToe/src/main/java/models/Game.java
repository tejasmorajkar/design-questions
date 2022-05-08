package models;

import lombok.Getter;
import lombok.Setter;
import strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    private List<Player> players = new ArrayList<>();
    private Board board;
    private WinningStrategy winningStrategy;

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Game game;

        Builder() {
            this.game = new Game();
        }

        public Builder withBoardDimension(int rows, int cols) {
            Board board = new Board(rows, cols);
            this.game.setBoard(board);
            return this;
        }

        public Builder withPlayer(Player player) {
            this.game.getPlayers().add(player);
            return this;
        }

        public Game build() {
            boolean isValid = validateGame();
            if (!isValid) {
                throw new RuntimeException("Game is not valid");
            }
            return this.game;
        }

        private boolean validateGame() {
            if (this.game.getPlayers().size() > 2)
                return false;
            return true;
        }
    }
}
