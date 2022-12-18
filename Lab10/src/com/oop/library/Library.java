package com.oop.library;

public class Library {
    Rent[] rent;

    public Library(Rent[] rent) {
        this.rent = rent;
    }

    public Rent getLongestRent() {
        long maxRent = 0;
        int index = 0;
        for (int i = 0; i < this.rent.length; i++) {
            if (rent[i].getEnd().getTime() - rent[i].getBegin().getTime() > maxRent) {
                maxRent = rent[i].getEnd().getTime() - rent[i].getBegin().getTime();
                index = i;
            }
        }
        return rent[index];
    }

}
