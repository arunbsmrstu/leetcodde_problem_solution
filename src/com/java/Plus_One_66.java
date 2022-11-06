package com.java;

public class Plus_One_66 {
    //    Input: digits = [4,3,2,1]
//    Output: [4,3,2,2]
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        String tempStr = "";
        int temp = 0;
        int d = digits[len - 1];
        d = d + 1;
        if (d == 10) {
            tempStr += "0";
            temp = 1;
        } else {
            tempStr += d;
            temp = 0;
        }
        for (int i = len - 2; i >= 0; i--) {
            d = digits[i] + temp;
            if (d == 10) {
                tempStr += "0";
                temp = 1;
            } else {
                tempStr += d;
                temp = 0;
            }
        }
        if(temp==1){
            tempStr += "1";
        }
        int[] arr = new int[tempStr.length()];
        for (int i =0; i<tempStr.length(); i++) {
            arr[tempStr.length()-1-i] = tempStr.charAt(i)-'0';
        }
        return arr;
    }

    public static void main(String arg[]) {
        int[] digits = new int[]{4, 9, 9, 9};
        int[] result = plusOne(digits);
        for (int d : result) {
            System.out.println(d);
        }
    }
}
