package designpatterns.Creational.Prototype.Problem;

public class GameClientWithoutPrototype {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));

        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoard copiedGameBoard = new GameBoard();
        for(GamePiece gamePiece: gameBoard.getPieces()) {
            copiedGameBoard.addPiece(new GamePiece(gamePiece.getColor(), gamePiece.getPosition()));
            //Problem 1: Client has to change and know about the internals of class
            // They are tightly coupled, any change in game piece has to make change in client
            // Also the error changes are high
        }

        System.out.println("Copied board");
        copiedGameBoard.showBoardState();
    }
}
