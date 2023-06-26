package ch_6;

import java.util.Arrays;

public class Sol6_17 {
    public static int[] shuffle(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random()* arr.length);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = { 1,2,3,4,5,6,7,8,9 };
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}