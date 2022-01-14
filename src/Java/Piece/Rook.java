package Piece;

import java.util.ArrayList;
import Coords.*;

public class Rook extends Piece{
    //creates a rook piece - Slider
    public Rook(int x, int y, boolean col) throws Exception{
        super(x, y, "Rook", col);
        createMoveList();
    }

    public void createMoveList(){
        ArrayList<Spot> newMoveList = new ArrayList<Spot>();
        //grab going side to side exclude current
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
    //     try{
    //         Rook testRook = new Rook(0,1);
    //         System.out.println(testRook.toString());
    //         testRook.movePiece(1, 1);
    //         System.out.println(testRook.toString());


    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }

    // }
    
}
