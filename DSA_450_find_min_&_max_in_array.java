package com.company;

public class Main {

    int max,min;
    public static void main(String[] args) {

        Main m1 = new Main();

        int[] arr = {45, -89, 8, 20, 4, 63, -7, 6, 55, 130, 7};

        int size = arr.length;
        m1.largestAndSmallestVal(arr,size);
        System.out.println("Max is : " + m1.max);
        System.out.println("Min is : " + m1.min);


    }

     void largestAndSmallestVal(int arr[], int size){


            int i;

            if(size == 1){
                max = arr[0];
                min = arr[0];
            }

            if(arr[0] > arr[1]){
                max = arr[0];
                min = arr[1];
            }else{
                max = arr[1];
                min = arr[0];
            }

            for(i = 2; i < size; i++){
                if(arr[i] > max){
                    max = arr[i];
                }else if(arr[i] < min){
                    min = arr[i];
                }
            }


    }



}
