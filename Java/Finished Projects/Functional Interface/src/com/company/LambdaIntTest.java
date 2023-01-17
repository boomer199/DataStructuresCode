package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class LambdaIntTest {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        IntOperation square = number -> number * number;
        IntOperation cube = number -> number * number * number;
        IntOperation negate = number -> -number;

        System.out.println("Enter the number corresponding to operation you want to perform on the list of integers:");
        System.out.println("1. Square the numbers");
        System.out.println("2. Cube the numbers");
        System.out.println("3. Negate the numbers");

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        IntOperation operation;
        switch (userInput) {
            case 1:
                operation = square;
                break;
            case 2:
                operation = cube;
                break;
            case 3:
                operation = negate;
                break;
            default:
                operation = square;
                break;
        }

        System.out.println("Original List " + intList);
        for (int i = 0; i < intList.size(); i++) {
            intList.set(i, operation.operate(intList.get(i)));
        }
        System.out.println("Modified List: " + intList);
    }
}

