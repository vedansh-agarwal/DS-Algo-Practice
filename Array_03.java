package com.company;

import java.util.Arrays;

public class Array_03 {
    public static void main(String[] args) {
        int array[] = {3,2,5,8,9,1,4,6,10,2};
        int k = 3;
        int kthMinMax[] = findKthMinMax(array, k);
        System.out.println(Arrays.toString(kthMinMax));
    }

    public static int[] findKthMinMax(int[] array, int k) {
        Arrays.sort(array);
        return new int[] {array[k], array[array.length-k]};
    }
}
