package strategies;

import models.Board;
import models.BoardCell;

public interface PlayingStrategy {
    public BoardCell play(Board board);
}
