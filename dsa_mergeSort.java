package com.company;

public class Main {

    public static void main(String[] args) {

        int [] arr = {5,8,-9,23,65,60};

        mergeSort(arr,0,5);

        for(int rr : arr){
            System.out.println(rr);
        }

    }

    public static void mergeSort(int[] input, int start, int end){

        if(start >= end){
            return;
        }

        int mid = (start + end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid+1,end);
        merge(input,start,mid,end);


    }

    public static void merge(int[] arr, int start, int mid, int end){

        int i = start;
        int j = mid+1;
        int k = start;

        int temp[] = new int[25];

//code to sort the data of array .
            while(i <= mid && j <= end){
                if(arr[i] < arr[j]){
                    temp[k++] = arr[i++];
                }else{
                    temp[k++] = arr[j++];
                }
            }


// if any one of the array is completed first then whole the remaing array should be copied to that array.


            while(i<= mid){
                temp[k++] = arr[i++];
            }
            while(j<=end){
                temp[k++] = arr[j++];
            }



//storing the sorted data of array into main array from temporary array.

            for(int l = start; l <=end; l++){
                arr[l] = temp[l];
            }



    }
}
