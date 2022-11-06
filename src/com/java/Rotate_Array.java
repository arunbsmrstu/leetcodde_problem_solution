package com.java;

public class Rotate_Array {

//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]

    public static void reverse(int arr[],int i,int j){
        int temp=0;
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] nums, int k){
        if(nums == null || nums.length < 2){
            return;
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }


    public static void main(String arg[]){
        int[] data= new int[]{1,2,3,4,5,6,7};
        rotate(data,3);
        for (int d:data)
            System.out.println(d);

    }
}
