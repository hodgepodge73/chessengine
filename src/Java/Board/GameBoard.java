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
        Rook RW1 = new Rook(0, 0, true);
        game[0][0].setPieceOnSquare(RW1);

        Knight NW1 = new Knight(1, 0, true);
        game[1][0].setPieceOnSquare(NW1);

        Bishop BW1 = new Bishop(2, 0, true);
        game[2][0].setPieceOnSquare(BW1);

        King KW = new King(3, 0, true);
        game[3][0].setPieceOnSquare(KW);

        Queen QW = new Queen(4, 0, true);
        game[4][0].setPieceOnSquare(QW);

        Bishop BW2 = new Bishop(5, 0, true);
        game[5][0].setPieceOnSquare(BW2);

        Knight NW2 = new Knight(6, 0, true);
        game[6][0].setPieceOnSquare(NW2);

        Rook RW2 = new Rook(7, 0, true);
        game[7][0].setPieceOnSquare(RW2);

        Pawn PW1 = new Pawn(0, 1, true);
        game[0][1].setPieceOnSquare(PW1);
        Pawn PW2 = new Pawn(1, 1, true);
        game[1][1].setPieceOnSquare(PW2);
        Pawn PW3 = new Pawn(2, 1, true);
        game[2][1].setPieceOnSquare(PW3);
        Pawn PW4 = new Pawn(3, 1, true);
        game[3][1].setPieceOnSquare(PW4);
        Pawn PW5 = new Pawn(4, 1, true);
        game[4][1].setPieceOnSquare(PW5);
        Pawn PW6 = new Pawn(5, 1, true);
        game[5][1].setPieceOnSquare(PW6);
        Pawn PW7 = new Pawn(6, 1, true);
        game[6][1].setPieceOnSquare(PW7);
        Pawn PW8 = new Pawn(7, 1, true);
        game[7][1].setPieceOnSquare(PW8);

        //BLACK
        Rook RB1 = new Rook(0, 7, false);
        game[0][7].setPieceOnSquare(RB1);

        Knight NB1 = new Knight(1, 7, false);
        game[1][7].setPieceOnSquare(NB1);

        Bishop BB1 = new Bishop(2, 7, false);
        game[2][7].setPieceOnSquare(BB1);

        King KB = new King(3, 7, false);
        game[3][7].setPieceOnSquare(KB);

        Queen QB = new Queen(4, 7, false);
        game[4][7].setPieceOnSquare(QB);

        Bishop BB2 = new Bishop(5, 7, false);
        game[5][7].setPieceOnSquare(BB2);

        Knight NB2 = new Knight(6, 7, false);
        game[6][7].setPieceOnSquare(NB2);

        Rook RB2 = new Rook(7, 7, false);
        game[7][7].setPieceOnSquare(RB2);

        Pawn PB1 = new Pawn(0, 6, false);
        game[0][6].setPieceOnSquare(PB1);
        Pawn PB2 = new Pawn(1, 6, false);
        game[1][6].setPieceOnSquare(PB2);
        Pawn PB3 = new Pawn(2, 6, false);
        game[2][6].setPieceOnSquare(PB3);
        Pawn PB4 = new Pawn(3, 6, false);
        game[3][6].setPieceOnSquare(PB4);
        Pawn PB5 = new Pawn(4, 6, false);
        game[4][6].setPieceOnSquare(PB5);
        Pawn PB6 = new Pawn(5, 6, false);
        game[5][6].setPieceOnSquare(PB6);
        Pawn PB7 = new Pawn(6, 6, false);
        game[6][6].setPieceOnSquare(PB7);
        Pawn PB8 = new Pawn(7, 6, false);
        game[7][6].setPieceOnSquare(PB8);

    }
    public String toString(){
        String returnStr = new String();
        for (int j = 0; j < SIZEOFBOARD; j ++){
            for (int i = 0; i<SIZEOFBOARD; i++){
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
