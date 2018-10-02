package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * A program to rotate a n * n matrix
 */
public class RotateMatrix {

    public static void main(String[] args) throws IOException {

        int arrayLength = 3;
        int inputArray [][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateArray(inputArray, arrayLength);
        displayEleInArray(inputArray,arrayLength);

    }

    private static void rotateArray(int inputArray[][], int arrayLength){
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < i; j++) {
                swapEleInArray(i,j,j,i,inputArray);
            }
            
        }
        flipArray(inputArray, arrayLength);
    }

    private static void flipArray(int inputArray[][], int arrayLength){
        int startPoint = 0;
        int endPoint = arrayLength - 1;
        int i, j;

        for (i = 0; i < arrayLength; i++) {
            startPoint = 0;
            endPoint = arrayLength - 1;

            for (j = 0; j < arrayLength / 2; j++) {
                swapEleInArray(i,startPoint,i, endPoint, inputArray);
                startPoint++;
                endPoint--;
            }
            if (startPoint != endPoint)
                swapEleInArray(i,startPoint,j, endPoint, inputArray);

        }
    }

    private static void displayEleInArray(int inputArray[][], int arrayLength){
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void swapEleInArray(int sourceRow, int sourceColumn, int destRow, int destColumn, int inputArray[][]){
        int temp = inputArray[sourceRow][sourceColumn];
        inputArray[sourceRow][sourceColumn] = inputArray[destRow][destColumn];
        inputArray[destRow][destColumn] = temp;
    }
}
