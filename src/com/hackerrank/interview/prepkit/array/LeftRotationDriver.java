package com.hackerrank.interview.prepkit.array;

/**
 * @author Velmurugan Moorthy
 * 28.06.2020
 * Problem : Repeated String
 * Description : (Left) Rotate the array
 * Question URL : https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class LeftRotationDriver {

    public static void main(String[] args) {


        LeftRotationTool leftRotater = new LeftRotationTool();

        //Input section

        int[] inputArray = {1,2,3,4,5,6};
        int rotationCount = 3;

        int[] rotatedArray = leftRotater.rotLeft(inputArray, rotationCount);

        displayArray(rotatedArray);

    }

    private static void displayArray(int[] rotatedArray) {

        for (int currentElement :
                rotatedArray) {
            System.out.println(" Current element : " + currentElement);
        }
    }
}

class LeftRotationTool {
    public int[] rotLeft(int[] inputArray, int rotationCount) {

        int arraySize = inputArray.length;

        if(rotationCount == arraySize || arraySize == 0) {
            return inputArray;
        }

        int result[] = new int[inputArray.length];

        //perform array rotation

        performRotation(inputArray, )


        return result;
    }
}
