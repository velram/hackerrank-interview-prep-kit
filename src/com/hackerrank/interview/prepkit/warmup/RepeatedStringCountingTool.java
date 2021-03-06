package com.hackerrank.interview.prepkit.warmup;

/**
 * @author Velmurugan Moorthy
 * 31.05.2020
 * Problem : Repeated String
 * Description : Find a character repition count in given string
 * Question URL : https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedStringCountingTool {
    private static final char ALPHABET_A = 'a';
    public static void main(String[] args) {

        /*String inputString = "abcac";
        long n = 10;
        */

          //Test case #2
        String inputString = "aba";
        long n = 11;

        // Test case #3
        /*String inputString = "a";
        long n = 1000000000000L;*/

        long repetitionCount = repeatedString(inputString, n);

        System.out.println("Repetition count is : " + repetitionCount);
    }
    // Complete the repeatedString function below.
    static long repeatedString(String inputString, long allowedCount) {
        long repetitionCount = 0L;
        int firstIndex = inputString.indexOf(ALPHABET_A);
        long inputStringLength = inputString.length();

        //Check for No 'a' character present
        if(firstIndex == -1){
            //System.out.println("No matching character found");
            return repetitionCount;
        }

        long characterCount = countCharacter(inputString);
        double charCountStrLengthRatio = ((double) characterCount / inputStringLength);
        System.out.println(" allowedCount = " + allowedCount + " characterCount = " + characterCount
                         + " input str length = " + inputStringLength);
        System.out.println("(characterCount / inputStringLength) = " + charCountStrLengthRatio);
        System.out.println("allowedCount * (charCountStrLengthRatio) : " + allowedCount * (charCountStrLengthRatio));
        System.out.println("Repetition count (double val) : " + Math.round(allowedCount * (charCountStrLengthRatio)));
        repetitionCount = (new Double(Math.round(allowedCount * (charCountStrLengthRatio) ))).longValue();
        System.out.println("Repetition count (long val): " + repetitionCount);

        return repetitionCount;
    }

    private static long countCharacter(String s) {
        long characterCount = 0;

        for (char currentCharacter :
                s.toCharArray()) {
            if(ALPHABET_A == currentCharacter) {
                characterCount++;
                //System.out.println("current characterCount is : " + characterCount);
            }
        }
        //System.out.println("Final characterCount is : " + characterCount);
        return characterCount;
    }
}


