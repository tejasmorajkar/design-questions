package models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import strategies.PlayingStrategy;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class Bot extends Player {
    private PlayingStrategy playingStrategy;

    @Override
    public BoardCell play(Board board) {
        return playingStrategy.play(board);
    }
}
