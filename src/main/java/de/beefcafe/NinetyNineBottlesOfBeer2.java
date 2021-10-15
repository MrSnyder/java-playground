package de.beefcafe;

public class NinetyNineBottlesOfBeer2 {

    private static String bottleString(int numBottles) {
        switch (numBottles) {
            case 0:
                return "No more bottles";
            case 1:
                return "1 bottle";
            default:
                return numBottles + " bottles";
        }
    }

    private static String instructionString(int numBottles) {
        if (numBottles == 0) {
            return "Go to the store and buy some more";
        }
        return "Take one down and pass it around";
    }

    public static void main(String[] args) {
        for (int n = 99; n >= 0; n--) {
            System.out.printf("%s of beer on the wall, %s of beer.\n", bottleString(n), bottleString(n).toLowerCase());
            System.out.printf("%s, %s of beer on the wall.\n\n", instructionString(n), bottleString(n).toLowerCase());
        }
    }
}
