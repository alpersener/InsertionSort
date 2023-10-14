package Sorting.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={56,18};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertion(int[] arr){
        for (int i = 0; i <=arr.length-2 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]) {
                    swapArray(arr,j,j-1);
                }
                else {
                    break;
                }

            }
            
        }
    }

    private static void swapArray(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
