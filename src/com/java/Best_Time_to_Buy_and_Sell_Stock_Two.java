package com.java;

public class Best_Time_to_Buy_and_Sell_Stock_Two {
//[7,1,5,3,6,4]
//    [1,2,3,4,5]
//    [7,6,4,3,1]
    public static int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit=profit+(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

    public static void main(String arg[]){
        int[] data= new int[]{7,6,4,3,1};
        System.out.println(maxProfit(data));
    }
}
