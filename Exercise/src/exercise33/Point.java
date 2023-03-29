package exercise33;

public class Point {
    private int x;
    private int y;

    public Point () {
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    public int getY () {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double distance () {
        Point defaultPoint = new Point( 0, 0 );
        int dX = defaultPoint.getX();
        int dY = defaultPoint.getY();
        return Math.sqrt( (dX - this.x) * (dX - this.x) + (dY - this.y) * (dY - this.y) );
    }

    public double distance (int x, int y) {
        return Math.sqrt( (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y) );
    }

    public double distance (Point b) {
        int x = b.getX();
        int y = b.getY();
        return Math.sqrt( (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y) );
    }
}
