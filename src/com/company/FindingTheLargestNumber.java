package com.company;

/*
 * @param [] array - the array in which to find the maximum number ;
 * @param i - number of iterations;
 * param max -variable to assign the largest number;
 */
public class FindingTheLargestNumber {
    public static void printsToTheConsoleTheMaximumNumberInAnArray(int[] array, int i, int max) {
        if (i == array.length) {
            System.out.println(max);
        }
        if (i < array.length) {
            if (array[i] > max) {
                max = array[i];
                printsToTheConsoleTheMaximumNumberInAnArray(array, i + 1, array[i]);
            } else {
                printsToTheConsoleTheMaximumNumberInAnArray(array, i + 1, max);
            }
        }
    }
}
