package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = {23, 47, -89, 63, 50, 10, -21, 36, -77};

        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0;lastUnsortedIndex--){

            for(int i = 1; i < lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }




    }

    public static void swap(int[] arr, int a, int b){

        if(arr[a] == arr[b]){
            return;
        }

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
