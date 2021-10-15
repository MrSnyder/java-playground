package de.beefcafe.beer;

public class NinetyNineBottlesOfBeer3 {

    public static void main(String[] args) {
        for (int n = 99; n >= 0; n--) {
            String s = " " + n + " bottles of beer on the wall, " + n + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (n - 1) + " bottles of beer on the wall.";
            s = s.replace("-1", "99");
            s = s.replace(" 1 bottles", " 1 bottle");
            s = s.replace(" 0", " No more");
            s = s.replace(", N", ", n");
            s = s.replace("Take one down and pass it around, 99", "Go to the store and buy some more, 99");
            System.out.println(s.substring(1) + "\n");
        }
    }
}
