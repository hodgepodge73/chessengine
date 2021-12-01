package Coords;

public class Coords {
    private int x;
    private int y;

    public boolean equals(Object o) {
        Coords c = (Coords) o;
        return c.x == x && c.y == y;
    }

    public Coords(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
        return x + 31*y;
    }

    public String toString(){
        return this.x + " " + this.y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
}
