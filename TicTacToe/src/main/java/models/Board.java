package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Board {
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int rows, int cells) {
        List<BoardCell> singleRow = Collections.nCopies(cells, new BoardCell());
        List<List<BoardCell>> nRows = Collections.nCopies(rows, singleRow);
        this.cells = nRows;
    }
}
