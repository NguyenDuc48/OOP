package lab5;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
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

    public int[] getXY() {
        int[] arrXY = {this.getX(), this.getY()};
        return arrXY;
    }

    public void setXY(int x, int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";

    }

    public double distance(int x, int y) {
        return Math.sqrt((this.getX() - x) * (this.getX() - x) + (this.getY() - y) * (this.getY() - y));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((this.getX() - another.getX()) * (this.getX() - another.getX()) + (this.getY() - another.getY()) * (this.getY() - another.getY()));
    }

    public double distance() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
    }


}
