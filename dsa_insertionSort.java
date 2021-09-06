package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = {54,-6,65,-8,-78,0,23,12,45,6};

        for(int firstUnsortedIndex  = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){

            int newElement = arr[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];

            }
            arr[i] = newElement;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
