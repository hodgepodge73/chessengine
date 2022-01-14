package Board;

public class Board {
    private int cols, rows;
    //basic board class
    public Board(){
        this.rows = 8;
        this.cols = 8;
    }
    public Board(int x, int y){
        this.rows = y;
        this.cols = x;
    }
    public Board(Object o) throws Exception {
        if (o instanceof Board){
            Board p = (Board) o;
            this.rows = p.getRows();
            this.cols = p.getCols();
        }
        else {
            throw new Exception("Board invalid");
        }
        
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
