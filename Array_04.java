package com.company;

import java.util.Arrays;

public class Array_04 {
    public static void main(String[] args) {
        int array[] = {0,1,2,0,1,2,0,2,1,1,2,0,0,0,1};
        sort012(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort012(int[] array) {
        int n = array.length;
        int count[] = {0,0,0};
        for(int i = 0; i < n; i++) {
            if(array[i] == 0)
                count[0]++;
            else if(array[i] == 1)
                count[1]++;
            else
                count[2]++;
        }
        for(int i = 0; i < count[0]; i++)
            array[i] = 0;
        for(int i = count[0]; i < count[0]+count[1]; i++)
            array[i] = 1;
        for(int i = count[0]+count[1]; i < n; i++)
            array[i] = 2;
    }
}
