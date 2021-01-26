package com.company;

public class Main {

    public static void main(String[] args) {

        Main m1 = new Main();

        int[] arr = {1,2,3,56,89,555};
        int start = 0;
        int end = arr.length -1;
        m1.reverseArray(arr,start,end);
        m1.printArray(arr);

    }

     void reverseArray(int[] arr, int start, int end){
        for(int i = 0; i < arr.length; i++){
            if(start == end || start > end){
                return;
            }
            swap(arr, start++, end--);

        }
    }
//To print an Array
    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

//For swap
    static void swap(int[] arr, int start, int end){

        if(start == end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
