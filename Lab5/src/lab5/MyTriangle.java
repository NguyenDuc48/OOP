package lab5;

public class MyTriangle {
    private MyPoint v1, v2, v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        double len1 = v1.distance(v2);
        double len2 = v1.distance(v3);
        double len3 = v3.distance(v2);
        return len1 + len3 + len2;
    }

    public String getType() {
        double len1 = v1.distance(v2);
        double len2 = v1.distance(v3);
        double len3 = v3.distance(v2);
        if (len1 == len2 && len2 == len3) {
            return "Equilateral";
        } else if (len1 != len2 && len2 != len3 && len1 != len3) {

            return "Scalence";
        } else {
            return "Isosceles";
        }
    }
}
