package Week1;

public class Point {

    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "(" + x + ","+y+")";
    }

    public Point add(Point other) {
        return new Point(this.x+ other.x,this.y + other.y);
    }
}
