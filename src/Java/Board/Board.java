package Board;

public class Board {
    private int cols, rows;


    public Board(int x, int y){
        this.rows = y;
        this.cols = x;
    }

    public void copy(Object o) throws Exception{
        if (o instanceof Board){
            Board temp = (Board) o;
            this.cols = temp.cols;
            this.rows = temp.rows;
        }
        else {
            throw new Exception("Couldnt copy board");
        }
    }
    public int getCols(){
        return this.cols;
    }
    public int getRows(){
        return this.rows;
    }
}
