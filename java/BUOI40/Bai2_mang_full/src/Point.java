public class Point {
    private int x ;
    private int y ;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){}
    public Point(Point b){
        this.x = b.x;
        this.y = b.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //Overide phương thức toString dễ dàng in đối tượng
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
