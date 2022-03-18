package com.company;

import java.util.Arrays;

public class Array_07 {
    public static void main(String[] args) {
        int array[] = {85,25,1,32,54,6};
        int n = 6;
        rotate(array,n);
        System.out.println(Arrays.toString(array));
    }

    public static void rotate(int[] array, int n) {
        int temp;
        for(int i = n-1; i > 0; i--) {
            temp = array[i];
            array[i] = array[i-1];
            array[i-1] = temp;
        }
    }
}
