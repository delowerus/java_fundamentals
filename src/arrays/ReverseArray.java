package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 7, 8, 1, 9};
        System.out.println(printReverse(arr));
    }
    public static int[] printReverse(int[] input ){
        int n = input.length;
        int[] revArr = new int[n];

        int j = 0;
        for(int i = input.length-1; i>=0; i--){
           revArr[j] = input[i];
           j++;
        }
        System.out.println(Arrays.toString(input));
        return revArr;

    }
}
