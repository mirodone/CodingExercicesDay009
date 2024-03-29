package ro.mirodone;

public class Point {

    private int x=0;
    private int y=0;

    public Point (){
        this(0,0);

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return this.distance(0 ,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public double distance (Point p){
        return distance(p.getX(), p.getY());
    }

}
