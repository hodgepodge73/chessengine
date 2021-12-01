package Board;

import Coords.*;

public class GameBoard extends Board{
    private Square[][] game;

    public GameBoard(){
        super();
        game = new Square[8][8];
        for (int i = 0; i < 8; i ++){
            for (int j =0; j < 8; j++){
                game[i][j] = new Square(i, j);
            }
        }
    }
    public void performMove(int x, int y, int x2, int y2) {
        game[x][y].setTaken(false);
        game[x2][y2].setTaken(true);
        try {
            game[x2][y2].getPieceOnSquare().copy(game[x][y].getPieceOnSquare());
            game[x2][y2].getPieceOnSquare().movePiece(x2, y2);
            game[x][y].setPieceOnSquare(null);
        }
        catch (Exception e){
            //something
            System.out.println("Error moving piece in gameboard / might have worked");
        }
    }
    public void initialSetup(){

    }
}
