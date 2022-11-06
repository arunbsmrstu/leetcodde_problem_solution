package com.java;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String arg[]){
        int[] data= new int[]{1,1,2};
        System.out.println(removeDuplicates(data));
    }
}
