package Piece;

import java.util.ArrayList;
import Coords.*;

public class Knight extends Piece{
    //knight piece
    public Knight(int x, int y, boolean colour) throws Exception{
        super(x, y, "Knight", colour);
        createMoveList();
    }
    public void createMoveList(){
        ArrayList<Spot> newMoveList = new ArrayList<Spot>();
        //L movement
        int currX = this.getLocation().getX();
        int currY = this.getLocation().getY();
        if (currX > 1 && currY >0)
            newMoveList.add(new Spot(currX-2, currY-1, 3));
        if (currX > 1 && currY < 7)
            newMoveList.add(new Spot(currX-2, currY+1, 3));
        if (currX > 0 && currY < 6)    
            newMoveList.add(new Spot(currX-1, currY+2, 3));
        if (currX < 7 && currY < 6)
            newMoveList.add(new Spot(currX+1, currY+2, 3));
        if (currX < 6 && currY < 7)
            newMoveList.add(new Spot(currX+2, currY+1, 3));
        if (currX <6 && currY > 0)
            newMoveList.add(new Spot(currX+2, currY-1, 3));
        if (currX < 7 && currY > 1)
            newMoveList.add(new Spot(currX+1, currY-2, 3));
        newMoveList.add(new Spot(currX-1, currY-2, 3));
        this.setMoveList(newMoveList);
    }
    
}
