package designpatterns.Creational.Prototype.Solution;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    private List<GamePiece> pieces = new ArrayList<>();
    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }
    public List<GamePiece> getPieces() {
        return pieces;
    }

    public void showBoardState() {
        System.out.println("Current board state:");
        for(GamePiece piece :pieces) {
            System.out.println(piece.toString());
        }
    }

    @Override
    public GameBoard clone() {
        GameBoard copiedGameBoard = new GameBoard();
        for(GamePiece gamePiece: this.getPieces()) {
            copiedGameBoard.addPiece(gamePiece.clone());
        }
        return copiedGameBoard;
    }
}
