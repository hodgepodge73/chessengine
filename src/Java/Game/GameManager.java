package Game;

import Board.GameBoard;

public class GameManager {
    //create references for each element of a game of chess
    private GameBoard gameBoard;
    private GameReferee gameReferee;
    private GameDisplay gameDisplay;
    private boolean turn;
    private boolean gameOver;
    
    //Constructor
    public GameManager(){
        gameBoard = new GameBoard();
        gameReferee = new GameReferee(8, 8);
        gameDisplay = new GameDisplay();
        gameOver = false;
    }

    //start up a game instance
    public void initalizeGame() throws Exception{
        gameBoard.initialSetup();
    }
    //game over get and set
    public boolean getGameOver(){
        return this.gameOver;
    }
    public void setGameOver(boolean go){
        this.gameOver = go;
    }
    //test main
    public static void main(String [] args){
        GameManager test = new GameManager();
        try {
            test.initalizeGame();
            System.out.println(test.gameBoard.toStringReverse());
        } catch (Exception f){
            System.out.println(f.getMessage());
        }
        do {

        }while(!test.getGameOver());
    }
    
}
