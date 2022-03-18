package com.company;

import java.util.Arrays;

public class Array_01 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        arrayReverser(array);
        System.out.println(Arrays.toString(array));
    }

    public static void arrayReverser(int array[]) {
        int n = array.length;
        int temp;
        for(int i = 0; i < n/2; i++) {
            temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
    }
}
