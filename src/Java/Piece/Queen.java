package Piece;

import java.util.ArrayList;
import Coords.*;

public class Queen extends Piece{
    public Queen(int x, int y, boolean colour) throws Exception{
        super(x, y, "Queen", colour);
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
        for (int i = 0; i < this.getBoard().getCols(); i++){
            if (i != this.getLocation().getX()){
                newMoveList.add(new Spot(i, this.getLocation().getY(), 3));
            }
        }
        //grab going up and down exclude current
        for (int i = 0; i < this.getBoard().getRows(); i++){
            if (i != this.getLocation().getY()){
                newMoveList.add(new Spot( this.getLocation().getX(), i, 3));
            }
        }
        this.setMoveList(newMoveList);
    }
    // public static void main(String args[]){
    //         try{
    //             Queen testBishop = new Queen(3,3);
    //             System.out.println(testBishop.toString());
    //             testBishop.movePiece(1, 2);
    //             System.out.println(testBishop.toString());
    
    
    //         }
    //         catch(Exception e){
    //             System.out.println(e.getMessage());
    //         }
    
    //     }
}
