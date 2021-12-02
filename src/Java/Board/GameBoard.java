package Board;

import Coords.*;
import Piece.*;

public class GameBoard extends Board{
    private Square[][] game;
    public final int SIZEOFBOARD = 8;
    public GameBoard(){
        super();
        game = new Square[SIZEOFBOARD][SIZEOFBOARD];
        for (int i = 0; i < SIZEOFBOARD; i ++){
            for (int j =0; j < SIZEOFBOARD; j++){
                game[i][j] = new Square(i, j);
            }
        }
    }
    public void performMove(int x, int y, int x2, int y2) {
        game[x][y].setTaken(false);
        game[x2][y2].setTaken(true);
        try {
            game[x][y].getPieceOnSquare().movePiece(x2, y2);
            game[x2][y2].setPieceOnSquare(game[x][y].getPieceOnSquare());
            game[x][y].setPieceOnSquare(null);
        }
        catch (Exception e){
            //something
            System.out.println(e.getMessage());
        }
    }
    public void initialSetup() throws Exception{
        Rook RW = new Rook(0, 0, false);
        game[0][0].setPieceOnSquare(RW);
    }
    public String toString(){
        String returnStr = new String();
        for (int i = 0; i < SIZEOFBOARD; i ++){
            for (int j = 0; j<SIZEOFBOARD; j++){
                if (game[i][j].getTaken()){
                    if (game[i][j].getPieceOnSquare() instanceof Rook){
                        returnStr += "R";
                    }
                    else if (game[i][j].getPieceOnSquare() instanceof Pawn){
                        returnStr += "P";
                    }
                    else if (game[i][j].getPieceOnSquare() instanceof Queen){
                        returnStr += "Q";
                    }
                    else if (game[i][j].getPieceOnSquare() instanceof King){
                        returnStr += "K";
                    }
                    else if (game[i][j].getPieceOnSquare() instanceof Knight){
                        returnStr += "N";
                    }
                    else if (game[i][j].getPieceOnSquare() instanceof Bishop){
                        returnStr += "B";
                    }
                    if (game[i][j].getPieceOnSquare().getColor()){
                        returnStr += "W ";
                    }
                    else{
                        returnStr += "B ";
                    }
                }
                else {
                    returnStr += "0  ";
                }
            }
            returnStr += "\n";
        }
        return returnStr;
    }
    public static void main(String [] args)
    {
        GameBoard newGame = new GameBoard();
        try{
            newGame.initialSetup();
            System.out.println(newGame.toString());
            newGame.performMove(0, 0, 4, 0);
            System.out.println(newGame.toString());
        }
        catch(Exception f){
            System.out.println(f.getMessage());
        }
        
    }
}
