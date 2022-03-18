package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_06 {
    public static void main(String[] args) {
        int array1[] = {85,25,1,32,54,6};
        int array2[] = {85,32,2};
        int n = 6;
        int m = 3;
        int union[] = union(array1, array2, n, m);
        int intersection[] = intersection(array1, array2, n, m);
        System.out.println(Arrays.toString(union)+"\n"+Arrays.toString(intersection));
    }

    public static int[] union(int[] array1, int[] array2, int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if(!ans.contains(array1[i]))
                ans.add(array1[i]);
        for(int i = 0; i < m; i++)
            if(!ans.contains(array2[i]))
                ans.add(array2[i]);
        int array[] = new int[ans.size()];
        for(int i = 0; i < array.length; i++)
            array[i] = ans.get(i);
        return array;
    }

    public static int[] intersection(int[] array1, int[] array2, int n, int m) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr1.add(array1[i]);
        for (int i = 0; i < m; i++)
            if(arr1.contains(array2[i]))
                ans.add(array2[i]);
        int array[] = new int[ans.size()];
        for(int i = 0; i < array.length; i++)
            array[i] = ans.get(i);
        return array;
    }
}
