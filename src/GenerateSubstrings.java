/*
Name: Yunsu Han
Date: October 12, 2019
Class: APCS, E Section
Description: This program adds all the subsets of a string to a list.
 */

import java.util.ArrayList;

public class GenerateSubstrings {
    // This method gets all the subsets of a string and adds them to a list.
    public static void generateSubstrings(String str, String t, ArrayList<String> result) {
        // I tried but could not find out how to get rid of this t in the parameter.
        // This t is a dummy string that takes the rest of the string of str.
        // Please put the t value as "" in the main method.

        // Add a dummy string to list.
        result.add(t);

        // Call the method recursively when string is not nothing.
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                generateSubstrings(str.substring(i + 1, str.length()), t + str.charAt(i), result);
            }
        }
    }
}
