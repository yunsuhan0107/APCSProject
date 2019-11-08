/*
Name: Yunsu Han
Date: September 28, 2019
Class: APCS, E Section
Description: This class returns the standard deviation of the ages of an array of Person objects.
 */

class Deviation {
    // This method calculates the standard deviation of the ages in the array of Person objects.
    public static double stdDev(Person[] arrPerson, int sizeArr){
        double total = 0;
        double stdDev = 0;

        // Add up the numbers
        for(int i = 0; i <= sizeArr; i++){
            total += arrPerson[i].getAge();
        }

        // Calculate the mean
        double mean = total / sizeArr;

        // Subtract from the mean and square the result
        for(int i = 0; i <= sizeArr; i++){
            stdDev += Math.pow(mean - arrPerson[i].getAge(), 2);
        }

        // Return the square root of the result above
        return Math.sqrt(stdDev / sizeArr);
    }
}
