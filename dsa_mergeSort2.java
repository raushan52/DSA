package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[] = {56,1,32,0,-99,45,63,78,22,1,15,65,38};

        mergeSort(arr,0,arr.length-1);

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void mergeSort(int arr[], int start, int end){

        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int arr[], int start, int mid, int end){

        int i = start;
        int j = mid+1;
        int k = start;

        int temp[] = new int[(end+1)+start];

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid){
            temp[k++] = arr[i++];
        }

        while (j <= end){
            temp[k++] = arr[j++];
        }

        for(int ss = start; ss <= end; ss++){
            arr[ss] = temp[ss];
        }

    }
}
