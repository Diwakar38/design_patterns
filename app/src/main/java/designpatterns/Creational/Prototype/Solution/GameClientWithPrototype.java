package designpatterns.Creational.Prototype.Solution;

public class GameClientWithPrototype {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));

        gameBoard.showBoardState();

        GameBoard savedBoard = gameBoard.clone(); //Client is not concerned about how copying is done

        System.out.println("Copied board");
        savedBoard.showBoardState();
    }
}
