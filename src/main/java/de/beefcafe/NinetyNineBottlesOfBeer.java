package de.beefcafe;

public class NinetyNineBottlesOfBeer {

    public static void main(String[] args) {
        for (int n = 99; n >= 3; n--) {
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", n, n);
            System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n\n", n - 1);
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
        System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.\n");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
