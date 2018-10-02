package LeetCode;

import java.util.Arrays;


/**
 * Description : https://leetcode.com/problems/advantage-shuffle/description/
 */

public class AdvantageShuffle {

    public static void main(String[] args) {
        int A[] = {12, 24, 8, 32};   //8, 12, 24, 32
        int B[] = {13, 25, 32, 11};
//      int B[] = {13, 13, 13, 13};

        calcAdvantageShuffle(A, B);
    }

    private static void calcAdvantageShuffle(int A[], int B[]){
        Arrays.sort(A);
        int pos = 0;
        int tempArray[] = new int[A.length];

        for (int i = 0; i < B.length; i++) {
            pos = binarySearch(A, B[i]);

            if ( pos >= B.length || A[pos] == B[i] )
            {
                continue;
            }
            tempArray[i] = A[pos];
        }

        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }
    }

    private static int binarySearch(int sortedArray[], int searchEle) {

        int low = 0;
        int mid = 0;
        int high = sortedArray.length;
        int index = 0;

        for (int i = 0; i < sortedArray.length; i++) {
            mid = (low + high) / 2;
            if (sortedArray[mid] > searchEle)
            {
                high = mid;
            }
            else if (sortedArray[mid] < searchEle)
            {
                low = mid;
            }
            else if (sortedArray[mid] == searchEle)
            {
                break;
            }
        }

        return high;

    }

    public void swap(int[] nums, int startIndex, int endIndex){
        if (startIndex ==endIndex)
            return;

        int temp= nums[startIndex];
        nums[startIndex]= nums[endIndex];
        nums[endIndex]=temp;
    }

}
