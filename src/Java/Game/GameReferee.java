package Game;

public class GameReferee {
    private int rows, cols;

    //creates new referee
    public GameReferee(int x, int y){
        this.rows = y;
        this.cols = x;
    }
    //checks that the given move is a legal one
    public boolean legalMove(int x, int y, int x2, int y2){
        return !(checkForCheck(x, y, x2, y2) || checkForCheck(x, y, x2, y2) || captureCheck(x, y, x2, y2));
    }
    //checks that a check hasnt been made
    public boolean checkForCheck(int x, int y, int x2, int y2){
        //fill later
        return false;
    }
    //checks for check mate
    public boolean checkForMate(int x, int y, int x2, int y2){
        //
        return false;
    }
    //checks that a piece is caught
    public boolean captureCheck(int x, int y, int x2, int y2){
        //if caputring then legal. if not capturing but a piece is there then Illegal
        return false;
    }

}

