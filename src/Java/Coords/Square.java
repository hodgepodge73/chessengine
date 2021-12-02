package Coords;

import Piece.*;

public class Square {
    private int x;
    private int y;
    private Boolean taken; //0 is no no 1 is yes no 2 is no yes 3 is yes yes : capture move
    Piece pieceOnSquare;
    public boolean equals(Object o) {
        Square c = (Square) o;
        return c.x == x && c.y == y && c.taken == taken && pieceOnSquare.equals(c.pieceOnSquare);
    }

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        this.taken = false;
        pieceOnSquare = null;
    }
    public Square(Object o) throws Exception {
        if (o instanceof Square){
            Square p = (Square) o;
            this.x = p.getX();
            this.y = p.getY();
            this.taken = p.getTaken();
            this.setPieceOnSquare(p.getPieceOnSquare());
        }
        else {
            throw new Exception("Square invalid");
        }
        
    }
    public int hashCode() {
        return x + 31*y;
    }

    public String toString(){
        return this.x + " " + this.y + " " + this.taken + " " + this.pieceOnSquare.toString();
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean getTaken(){
        return taken;
    }
    public void setTaken(Boolean t){
        this.taken = t;
    }
    public Piece getPieceOnSquare(){
        return pieceOnSquare;
    }
    public void setPieceOnSquare(Object p) throws Exception{
        if (p instanceof Piece){
            Piece o = (Piece)p;
            if (x != o.getLocation().getX() || y != o.getLocation().getY())
                throw new Exception("Must be same square");
            if (p instanceof Rook){
                Rook a = (Rook) p;
                pieceOnSquare = new Rook(a.getLocation().getX(), a.getLocation().getY(), a.getColor());
                taken = true;
            }
            else if (p instanceof Pawn){
                Pawn a = (Pawn) p;
                pieceOnSquare = new Pawn(a.getLocation().getX(), a.getLocation().getY(), a.getColor());
                taken = true;
            }
            else if (p instanceof Knight){
                Knight a = (Knight) p;
                pieceOnSquare = new Knight(a.getLocation().getX(), a.getLocation().getY(), a.getColor());
                taken = true;
            }
            else if (p instanceof King){
                King a = (King) p;
                pieceOnSquare = new King(a.getLocation().getX(), a.getLocation().getY(), a.getColor());
                taken = true;
            }
            else if (p instanceof Queen){
                Queen a = (Queen) p;
                pieceOnSquare = new Queen(a.getLocation().getX(), a.getLocation().getY(), a.getColor());
                taken = true;
            }
            else if (p instanceof Bishop){
                Bishop a = (Bishop) p;
                pieceOnSquare = new Bishop(a.getLocation().getX(), a.getLocation().getY(), a.getColor());
                taken = true;
            }
            else{
                throw new Exception("Not a valid piece on the square");
            }
        }
        

    }
}
