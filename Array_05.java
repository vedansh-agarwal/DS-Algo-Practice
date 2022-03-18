package com.company;

import java.util.Arrays;

public class Array_05 {
    public static void main(String[] args) {
        int array[] = {-12,11,-13,-5,6,-7,5,-3,-6};
        negativeToLeft(array);
        System.out.println(Arrays.toString(array));
    }

    public static void negativeToLeft(int[] array) {
        int n = array.length;
        int temp;
        int lastNegative = n-1;
        for(int i = 0; i < n; i++) {
            if(array[i] > 0) {
                int j = lastNegative;
                while(array[j] >= 0) {
                    j--;
                }
                if (j > i) {
                    lastNegative = j;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                else
                    break;
            }
        }
    }
}
