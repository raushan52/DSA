package com.company;

public class Main {

    public static void main(String[] args) {

        int [] arr = {23,56,885,74,-6,9};
        int size = arr.length;

        if(arraySortedOrNot(arr,size) != 0){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

    public static int arraySortedOrNot(int arr[], int size){

        if(size == 0 || size == 1){
            return 1;
        }

        if(arr[size-1] < arr[size-2]){
            return 0;
        }

        return arraySortedOrNot(arr,size-1);
    }
}
