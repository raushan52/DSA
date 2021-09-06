package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = {45,-8,96,3,12,0,14,1,25,8,45,78,25,36,-56,-47};

        for(int lastUnsortedElement = arr.length -1; lastUnsortedElement > 0; lastUnsortedElement--){

            int largest = 0;
            for(int i = 1; i <= lastUnsortedElement; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedElement);
        }

        printArray(arr);

    }

    static void swap(int[] myArray, int largest, int lastUnsortedElement){

        if(largest == lastUnsortedElement){
            return;
        }
        int temp = myArray[largest];
        myArray[largest] = myArray[lastUnsortedElement];
        myArray[lastUnsortedElement] = temp;



    }

    static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
