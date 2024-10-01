package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,9,1};
        int temp;
        int j;
        for (int i=1;i< arr.length; i++){
            temp = arr[i];
            j = i-1;
            while (j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
