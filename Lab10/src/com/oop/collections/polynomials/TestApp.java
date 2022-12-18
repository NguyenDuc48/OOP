package com.oop.collections.polynomials;

public class TestApp {
    public static void main(String[] args) {

        Poly arrayPoly = new ArrayPoly(new double[]{-4, 3, 4, 9});
        Poly listPoly = new ListPoly(new double[]{1, -2, 0, 8});

        System.out.println("arrayPoly = " + arrayPoly);
        System.out.println("listPoly = " + listPoly);

        if (arrayPoly.equals(listPoly) && listPoly.equals(arrayPoly))
            System.out.println("arrayPoly == listPoly");
        else
            System.out.println("arrayPoly != listPoly");

        arrayPoly = arrayPoly.derivative();
        System.out.println("arrayPoly' = " + arrayPoly.toString());

        arrayPoly = arrayPoly.derivative();
        System.out.println("arrayPoly'' = " + arrayPoly.toString());

        listPoly = listPoly.derivative();
        System.out.println("listPoly' = " + listPoly.toString());

        listPoly = listPoly.derivative();
        System.out.println("listPoly'' = " + listPoly.toString());
    }
}
