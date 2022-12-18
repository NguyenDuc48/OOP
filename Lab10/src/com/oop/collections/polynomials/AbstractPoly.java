package com.oop.collections.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {

    double[] derive() {
        double[] temp = new double[Math.max(1, degree())];
        for (int i = 1; i <= degree(); i++) {
            temp[i - 1] = coefficient(i) * i;
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Poly p)) {
            return false;
        }
        if (degree() != p.degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != p.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < degree(); i++) {
            sb.append(coefficient(i)).append("x^").append(i).append(" + ");
        }
        sb.append(coefficient(degree())).append("x^").append(degree());
        return sb.toString();
    }
}
