package Piece;

import java.util.ArrayList;

import Coords.*;
import Board.*;


public abstract class Piece{
    private Coords location;
    private String pieceName;
    private ArrayList<Spot> moveList;
    private ArrayList<Spot> previousMoves;
    private Board masterBoard;


    public Piece(){
        location = new Coords(0,0);
        this.pieceName = new String("Blank Piece");
        this.moveList = new ArrayList<Spot>();
        this.masterBoard = new Board(8,8);
        this.previousMoves = new ArrayList<Spot>();
    }
    public Piece(int x, int y, String type) throws Exception{
        super();
        // if (x < 0 || y < 0 || x > 7 || y > 7)
        //     throw new Exception("Invalid Coordinates");
        this.location = new Coords(x, y);
        this.pieceName = new String(type);
        this.moveList = new ArrayList<Spot>();
        this.masterBoard = new Board(8,8);
        this.previousMoves = new ArrayList<Spot>();
    }

    public void setBoard(Board b){
        try {
            masterBoard.copy(b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }    
    }
    public Board getBoard(){
        return this.masterBoard;
    }

    public void setLocation(int x, int y){
        this.location = new Coords(x, y);
    }
    public Coords getLocation(){
        return this.location;
    }

    public abstract void createMoveList();
    public void setMoveList(ArrayList<Spot> m){
        this.moveList = new ArrayList<Spot>(m);
    }
    public ArrayList<Spot> getMoveList(){
        return this.moveList;
    }
    public void movePiece(int x, int y) throws Exception{
        Spot newSpace = new Spot(x, y, 2);
        Spot newSpace2 = new Spot(x, y, 3);
        if (!moveList.contains(newSpace) && !moveList.contains(newSpace2)){
            throw new Exception("Not a valid move");
        }

        setLocation(x, y);
        createMoveList();
    }
    public void addPreviousLocale(int x, int y){
        previousMoves.add(new Spot(x, y, 0));
    }
    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }
    public String getPieceName(){
        return this.pieceName;
    }
    public String toString(){
        return new String(this.pieceName + " " + this.location.toString() + "\n" + this.moveList.toString());
    }
}