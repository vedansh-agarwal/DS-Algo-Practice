package com.company;

public class Array_08 {
    public static void main(String[] args) {
        int array[] = {-1,-2,-3,-4};
        int n = 4;
        System.out.println(maxSubarraySum(array, n));
    }

    public static long maxSubarraySum(int[] array, int n) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
            if(max < sum)
                max = sum;
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
