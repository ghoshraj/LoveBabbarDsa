package com.lovebabbar.dsa.array;

import java.util.ArrayList;

public class FindMaxMin {

    public static void main(String[] args) {
        int[] arr = {8, -3, 21, -4, 10};

        FindMaxMin obj = new FindMaxMin();
        ArrayList<Integer> result = obj.getMinMax(arr);

        System.out.println("Min value: " + result.get(0));
        System.out.println("Max value: " + result.get(1));

    }

    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //find min and max
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        //add the min and max in to the list and return it
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }
    
}
