package lab5;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("( ")
                .append(this.real)
                .append(" + ")
                .append(this.imag)
                .append("i")
                .append(" )");
        return description.toString();
    }

    public boolean isReal() {
        if (Double.compare(this.imag, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        if (Double.compare(this.real, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (Double.compare(this.real, real) == 0 && Double.compare(this.imag, imag) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        if (Double.compare(this.real, another.real) == 0 && Double.compare(this.imag, another.imag) == 0) {
            return true;
        }
        return false;
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double real = this.real + right.real;
        double imag = this.imag + right.imag;
        MyComplex newComplex = new MyComplex(real, imag);
        return newComplex;
    }
}
