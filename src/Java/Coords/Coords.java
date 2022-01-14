package Coords;

public class Coords {
    //coord just holds coords like a Vector
    private int x;
    private int y;

    public boolean equals(Object o) {
        Coords c = (Coords) o;
        return c.x == x && c.y == y;
    }

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coords(Object o) throws Exception {
        if (o instanceof Coords){
            Coords p = (Coords) o;
            this.x = p.getX();
            this.y = p.getY();
        }
        else {
            throw new Exception("Coord invalid");
        }
        
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
