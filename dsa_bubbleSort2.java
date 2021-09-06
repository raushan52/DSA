package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main m22 = new Main();

        int arr[] = {14,33,27,10,35,19,42,44};

        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1]){
                    m22.swap(arr, i, i+1);
                }
            }
        }

        m22.printArray(arr);


    }

    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    void swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
