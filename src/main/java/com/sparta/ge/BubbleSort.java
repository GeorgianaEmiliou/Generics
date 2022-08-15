package com.sparta.ge;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static <T extends Number> T[] bubbleSortMethod(T[] randomArrayToSort){
        int length = randomArrayToSort.length;
        T temp;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(randomArrayToSort[j].doubleValue() > randomArrayToSort[j+1].doubleValue()){
                    temp = randomArrayToSort[j];
                    randomArrayToSort[j] = randomArrayToSort[j+1];
                    randomArrayToSort[j+1] = temp;
                }
            }
        }
        return randomArrayToSort;
    }


    public static void main(String[] args) {
        Integer[] intNumbers = {2, 1, 8, 4};
        Double[] doubleNumbers = {2.8, 1.0, 5.2};
        System.out.println(Arrays.toString(bubbleSortMethod(intNumbers)));
        System.out.println(Arrays.toString(bubbleSortMethod(doubleNumbers)));
    }
}
