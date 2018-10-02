package LeetCode;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int N=-1,C=0;

        while (N<nums.length-1 && C< nums.length){
            if(nums[C]!=0){
                swap(nums, N+1,C);
                N++;
            }
            C++;
        }
    }

    public void swap(int[] nums, int startIndex, int endIndex){
        if (startIndex ==endIndex)
            return;

        int temp= nums[startIndex];
        nums[startIndex]= nums[endIndex];
        nums[endIndex]=temp;
    }

    public static void main(String[] args) {
        MoveZeros mv= new MoveZeros();
        int[] nums ={0,1,0,3,0,12};
        mv.moveZeroes(nums);

        Arrays.stream(nums).forEach(System.out::println);
    }
}
