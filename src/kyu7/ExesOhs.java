package kyu7;

/*
 * 7 kyu - Exes and Ohs
 *
 * https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
 *
 * DESCRIPTION:
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive.
 * The string can contain any char.
 *
 * Examples input/output:
 *      XO("ooxx") => true
 *      XO("xooxx") => false
 *      XO("ooxXm") => true
 *      XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 *      XO("zzoo") => false
*/

public class ExesOhs {
    public static boolean getXO (String str) {
        String[] letters = str.toLowerCase().split("");
        int countX = 0;
        int countO = 0;
        for (String s : letters) {
            if (s.equals("x")) {
                countX++;
            } else if (s.equals("o")) {
                countO++;
            }
        }
        return countO == countX;
    }
}
