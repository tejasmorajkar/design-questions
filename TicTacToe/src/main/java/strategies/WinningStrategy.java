package strategies;

import models.Board;
import models.Player;

import java.util.List;

public interface WinningStrategy {
    public Player checkWinner(Board board, List<Player> players);
}
