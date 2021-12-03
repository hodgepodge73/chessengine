package Game;

import Board.GameBoard;

public class GameManager {
    private GameBoard gameBoard;
    private GameReferee gameReferee;
    private GameDisplay gameDisplay;
    
    public GameManager(){
        gameBoard = new GameBoard();
        gameReferee = new GameReferee(8, 8);
        gameDisplay = new GameDisplay();
    }

    public void initalizeGame() throws Exception{
        gameBoard.initialSetup();
    }
    public static void main(String [] args){
        GameManager test = new GameManager();
        try {
            test.initalizeGame();
        } catch (Exception f){
            System.out.println(f.getMessage());
        }
    }
}
