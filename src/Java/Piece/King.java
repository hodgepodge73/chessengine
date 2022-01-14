package Piece;

import java.util.ArrayList;
import Coords.*;

public class King extends Piece{
    //King piece
    public King(int x, int y, boolean colour) throws Exception{
        super(x, y, "King", colour);
        createMoveList();
    }
    public void createMoveList(){
        ArrayList<Spot> newMoveList = new ArrayList<Spot>();
        //grab going side to side exclude current
        int x = this.getLocation().getX();
        int y = this.getLocation().getY();
        if (y < 7){
            if (x > 0)
                newMoveList.add(new Spot(x-1, y+1, 3));
            newMoveList.add(new Spot(x, y+1, 3));
            if (x < 7)
                newMoveList.add(new Spot(x+1, y+1, 3));
        }
        if (y>0){
            if (x > 0)
                newMoveList.add(new Spot(x-1, y-1, 3));
            newMoveList.add(new Spot(x, y-1, 3));
            if (x < 7)
                newMoveList.add(new Spot(x+1, y-1, 3));
        }
        if (x > 0)
            newMoveList.add(new Spot(x-1, y, 3));
        if (x < 7)
            newMoveList.add(new Spot(x+1, y, 3));
        this.setMoveList(newMoveList);
    }
    // public static void main(String args[]){
    //         try{
    //             King testK = new King(3,3);
    //             System.out.println(testK.toString());
    //             testK.movePiece(1, 2);
    //             System.out.println(testK.toString());
    
    
    //         }
    //         catch(Exception e){
    //             System.out.println(e.getMessage());
    //         }
    
    //     }
}
