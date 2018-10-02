package LeetCode;

import java.util.*;

public class JumpGame2{

    public static void main(String[] args) {
        int arr[]={1,3,2};
        System.out.println(jump(arr));

    }

    public static int jump(int arr[]){

        int maxNum = arr[0];
        int maxPos;
        int steps = -1;
        int counter = 0;

        if (arr.length == 1)
            return 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum)
            {
                maxNum = arr[i];
                maxPos = i;
                steps++;
                counter = arr[i];
            }

            if (counter == 0 ) {
                counter = arr[i];
                steps++;
            }
            counter--;
        }

        if (steps == 0)
            return 1;


        return steps;

    }


}