package com.company;

import java.util.Arrays;

public class Array_02 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int minMax[] = minMax(array);
        System.out.println(Arrays.toString(minMax));
    }

    public static int[] minMax(int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
            else if(array[i] > max)
                max = array[i];
        }
        return new int[] {min,max};
    }
}
