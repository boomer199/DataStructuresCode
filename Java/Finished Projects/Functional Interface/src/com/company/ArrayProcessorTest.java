package com.company;

import java.util.Arrays;

public class ArrayProcessorTest {


    public static final ArrayProcessor sumer = (array) -> {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    };


    public static final ArrayProcessor averager = array -> sumer.apply(array) / array.length;
    public static final ArrayProcessor miner = array -> Arrays.stream(array).min().getAsDouble();
    public static final ArrayProcessor maxer = array -> Arrays.stream(array).max().getAsDouble();

    public static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (double val : array) {
                if (val == value) {
                    count++;
                }
            }
            return count;
        };
    }

    public static void main(String[] args) {
        double[] firstList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] secondList = {17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14};

        System.out.println("Sum of first list (should be 55): " + sumer.apply(firstList));
        System.out.println("Average of first list (should be 5.5): " + averager.apply(firstList));
        System.out.println("Minimum of second list (should be -3.4): " + miner.apply(secondList));
        System.out.println("Maximum of second list (should be 42.0): " + maxer.apply(secondList));

        System.out.println();

        System.out.println("Count of 17.0 in second list (should be 3): " + counter(17.0).apply(secondList));
        System.out.println("Count of 20.0 in second list (should be 0): " + counter(20.0).apply(secondList));
        System.out.println("Count of 5.0 in first list (should be 1): " + counter(5.0).apply(firstList));
    }

}
