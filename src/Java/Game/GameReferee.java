package Game;

public class GameReferee {
    private int rows, cols;
    public GameReferee(int x, int y){
        this.rows = y;
        this.cols = x;
    }
    public boolean legalMove(int x, int y, int x2, int y2){
        return !(checkForCheck(x, y, x2, y2) || checkForCheck(x, y, x2, y2) || captureCheck(x, y, x2, y2));
    }
    public boolean checkForCheck(int x, int y, int x2, int y2){
        return false;
    }
    public boolean checkForMate(int x, int y, int x2, int y2){
        return false;
    }
    public boolean captureCheck(int x, int y, int x2, int y2){
        //if caputring then legal. if not capturing but a piece is there then Illegal
        return false;
    }

}

