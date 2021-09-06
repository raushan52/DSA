package com.company;

public class Main {

    public static void main(String[] args) {

       int[] arr = {5,23,56,41,01,-58,-98,8,2,8,45,8,1};


        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr, int i, int j){

        if(arr[i] == arr[j]){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
