package Coords;

public class Spot {
    private int x;
    private int y;
    private int take; //0 is no no 1 is yes no 2 is no yes 3 is yes yes : capture move

    public boolean equals(Object o) {
        Spot c = (Spot) o;
        return c.x == x && c.y == y && c.take == take;
    }

    public Spot(int x, int y, int take) {
        super();
        this.x = x;
        this.y = y;
        this.take = take;
    }

    public int hashCode() {
        return x + 31*y;
    }

    public String toString(){
        return this.x + " " + this.y + " " + this.take;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getTake(){
        return take;
    }
    public void setTake(int t){
        this.take = t;
    }
}
