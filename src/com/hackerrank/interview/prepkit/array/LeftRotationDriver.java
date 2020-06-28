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

        //Case #1 - Normal flow
       /* */
        int[] inputArray = {1,2,3,4,5,6,7,8};
        int rotationCount = 3;

        //Case #2 - Edge case - Rotate count = array size

       /*
         int[] inputArray = {1,2,3,4,5,6};
         int rotationCount = 6;
        */

        //Case #3 - Max rotate count possible

         /*
            int[] inputArray = {1,2,3,4,5,6};
            int rotationCount = 5;
        */

        //Case #4 - Average case (arraySize / 2)
        /*

          int[] inputArray = {1,2,3,4,5,6};
          int rotationCount = 3;
        */

        //Case #5 - Min possible rotation
        /*
        int[] inputArray = {1,2,3,4,5,6};
        int rotationCount = 1;
        */


        //Case #6 - Larger array input
        /*

        int[] inputArray = {33,47,70,37,8,53,13,93,71,72,51,100,60,87,97};
        int rotationCount = 13;
        */

        //Case #7 - Smaller input array and smaller rotation
        /*
        int[] inputArray = {1,2};
        int rotationCount = 1;
        */

        //Case #8 - Single element array and smaller rotation
        /*
        int[] inputArray = {1};
        int rotationCount = 1;
        */

        int[] rotatedArray = leftRotater.rotLeft(inputArray, rotationCount);

        displayArray(rotatedArray);

    }

    private static void displayArray(int[] rotatedArray) {

        System.out.println("\n\n Display array elements : \n\n ");
        for (int currentElement :
                rotatedArray) {
            System.out.print(" " + currentElement);
        }
    }
}

class LeftRotationTool {
    public int[] rotLeft(int[] inputArray, int rotationCount) {

        int arraySize = inputArray.length;

        if(rotationCount == arraySize || arraySize == 0) {
            return inputArray;
        }

        int result[] = performRotation(inputArray, rotationCount);


        return result;
    }

    private int[] performRotation(int[] inputArray, int rotationCount) {


        int arraySize = inputArray.length;
        int result[] = new int[arraySize];
        int resultArrayIndex = 0;

        System.out.println("Array size : " + arraySize + " \n");

        for(int loopIndex = rotationCount ; loopIndex < arraySize ; loopIndex++ ) {
            System.out.println("loopIndex : " + loopIndex + " | resultArray-element : " + inputArray[loopIndex]
                                +  " newArrayIndex : " + resultArrayIndex);
            result[resultArrayIndex++] = inputArray[loopIndex];
        }

        for(int loopIndex = 0 ; loopIndex < rotationCount ; loopIndex++ ) {
            System.out.println("loopIndex : " + loopIndex + " | resultArray-element : " + inputArray[loopIndex]
                    +  " newArrayIndex : " + resultArrayIndex);
            result[resultArrayIndex++] = inputArray[loopIndex];
        }

        return result;
    }
}