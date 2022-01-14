package Piece;

import java.util.ArrayList;
import Coords.*;

public class Pawn extends Piece{
    //pawn piece
    public Pawn(int x, int y, boolean colour) throws Exception{
        super(x, y, "Pawn", colour);
        createMoveList();
    }
    public void createMoveList(){
        ArrayList<Spot> newMoveList = new ArrayList<Spot>();
        //grab going side to side exclude current
        int currX = this.getLocation().getX();
        int currY = this.getLocation().getY();
        if (currY < 7){
            if (currX > 0){
                newMoveList.add(new Spot(currX - 1, currY+1, 1));
            }
            if (currX<7){
                newMoveList.add(new Spot(currX+1, currY+1, 1));
            }
            newMoveList.add(new Spot(currX, currY+1, 2));
        }
        this.setMoveList(newMoveList);
    }
    //replace self with a Queen instance
    public void promotion(){

    }
    // public static void main(String args[]){
    //     try{
    //         Pawn testPawn = new Pawn(0,1);
    //         System.out.println(testPawn.toString());
    //         testPawn.movePiece(1, 2);
    //         System.out.println(testPawn.toString());


    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }

    // }
}
