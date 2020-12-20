package com.hackerrank;

import java.io.*;
import java.util.*;

//https://www.youtube.com/watch?v=ogeXK-aKOoU
public class RotatingLeft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] rotatedArray = new int[a.length];
        int rotatingPoint = d;
        int i = 0;
        while(rotatingPoint<a.length){
            rotatedArray[i] = a[rotatingPoint];
            rotatingPoint++;
            i++;
        }
        rotatingPoint = 0;
        while(rotatingPoint<d){
            rotatedArray[i] = a[rotatingPoint];
            rotatingPoint++;
            i++;
        }

        return rotatedArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
