package lab5;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part) : ");
        double real1 = Double.parseDouble(in.next());
        double imag1 = Double.parseDouble(in.next());
        System.out.println();
        System.out.print("Enter complex number 2 (real and imaginary part) : ");
        double real2 = Double.parseDouble(in.next());
        double imag2 = Double.parseDouble(in.next());
        System.out.println();
        MyComplex number1 = new MyComplex(real1, imag1);
        MyComplex number2 = new MyComplex(real2, imag2);
        System.out.println("Number 1 is: " + number1.toString());
        if (!number1.isReal()) {
            System.out.println(number1.toString() + " is NOT a pure real number");

        }
        if (!number1.isImaginary()) {
            System.out.println(number1.toString() + " is NOT a imaginary real number");
        }

        System.out.println("Number 2 is: " + number2.toString());
        if (!number2.isReal()) {
            System.out.println(number2.toString() + " is NOT a pure real number");

        }
        if (!number2.isImaginary()) {
            System.out.println(number2.toString() + " is NOT a imaginary real number");
        }
        if (!number1.equals(number2)) {
            System.out.println(number1 + " is NOT equal to " + number2);
        }
        System.out.println(number1 + " + " + number2 + " = " + number1.addNew(number2));
    }

}
