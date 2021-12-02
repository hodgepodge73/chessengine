package Piece;

import java.util.ArrayList;
import Coords.*;

public class Bishop extends Piece{
    public Bishop(int x, int y, boolean colour) throws Exception{
        super(x, y, "Bishop", colour);
        createMoveList();
    }
    public void createMoveList(){
        ArrayList<Spot> newMoveList = new ArrayList<Spot>();
        //grab going side to side exclude current
        int x = this.getLocation().getX();
        int y = this.getLocation().getY();
        int count = 0;
        while (x - count > 0 && y + count < 7){
            count ++;
            newMoveList.add(new Spot(x-count, y + count, 3));
        }
        count = 0;
        while (x - count > 0 && y - count > 0){
            count ++;
            newMoveList.add(new Spot(x-count, y - count, 3));
        }
        count = 0;
        while (x + count < 7 && y - count > 0){
            count ++;
            newMoveList.add(new Spot(x+count, y - count, 3));
        }
        count = 0;
        while (x + count < 7 && y + count < 8){
            count ++;
            newMoveList.add(new Spot(x+count, y + count, 3));
        }
        this.setMoveList(newMoveList);
    }
    // public static void main(String args[]){
    //     try{
    //         Bishop testBishop = new Bishop(3,3);
    //         System.out.println(testBishop.toString());
    //         testBishop.movePiece(1, 2);
    //         System.out.println(testBishop.toString());


    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }

    // }
}
