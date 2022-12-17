package lab5;

public class MyPolynomical {
    private double[] coeffs;

    public MyPolynomical(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            description.append(this.coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 3, description.length());
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyValue += polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomical add(MyPolynomical right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolynomical = new double[maxDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            addPolynomical[i] += this.coeffs[i];
        }
        for (int i = 0; i <= this.getDegree(); i++) {
            addPolynomical[i] += right.coeffs[i];
        }
        MyPolynomical addPoly = new MyPolynomical(addPolynomical);
        return addPoly;
    }

    public MyPolynomical multiply(MyPolynomical right) {
        int multiPolyDegree = this.getDegree() + right.getDegree();
        double[] multiPolyData = new double[multiPolyDegree];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                multiPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolynomical multiPoly = new MyPolynomical(multiPolyData);
        return multiPoly;
    }
}
