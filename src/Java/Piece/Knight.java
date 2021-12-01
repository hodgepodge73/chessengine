package Piece;

import java.util.ArrayList;
import Coords.*;

public class Knight extends Piece{
    public Knight(int x, int y) throws Exception{
        super(x, y, "Knight");
        createMoveList();
    }
    public void createMoveList(){
        ArrayList<Spot> newMoveList = new ArrayList<Spot>();
        //grab going side to side exclude current
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
