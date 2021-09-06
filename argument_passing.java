package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FormArray frmary = new FormArray();
        int[] arr = frmary.creatingArray(12);

        ArrayPrinting arrpt = new ArrayPrinting();
        arrpt.printingArray(arr);

    }
}

class FormArray{

    int[] creatingArray(int data){
        int [] arr = new int[data];
        for(int i= 0; i<arr.length; i++){
            arr[i] = i;
         }
        return arr;

    }
}

class ArrayPrinting{

    void printingArray(int arr[]){
        for(int dr : arr){
            System.out.print(dr +" ");
        }
    }
}
