/*
Name: Yunsu Han
Date: September 28, 2019
Class: APCS, E Section
Description: This class returns the value the median of an int type array.
 */

import java.util.Arrays;

class FindMedian {
    // This method returns the median value of an array.
    public static double FindMedian(int[] arr, int arrSize){

        // Sort the array by sort method.
        Arrays.sort(arr);

        /* It receives the size of the array, divides into 2.
           If the remainder is 0, the number of elements in the array is even.
           Then, the method returns the two middle value's mean value. */
        if(arrSize % 2 == 0)
            return (arr[arrSize / 2] + arr[arrSize / 2 - 1]) / 2;

        /* In other cases, the remainder is 1, and so the number of elements in the array is odd.
           Then, the method returns the middle value. */
        return arr[arrSize/2];
    }
}
