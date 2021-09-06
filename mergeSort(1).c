#include <stdio.h>
#include <stdlib.h>
void mergeSort(int arr [],int start,int end);
void merge(int arr[], int start, int mid, int end);
void printArray(int arr[], int size);

int main() {
    int arr[] = {10,56,25,1,20,84,21,3,0,5};
    int size = sizeof(arr)/sizeof(arr[0]);
    mergeSort(arr,0,size-1);
    printArray(arr,size);
}
void mergeSort(int arr [],int start,int end){

    if(start >= end){
        return;       
    }
     int mid = (start + end)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
}
void merge(int arr[], int start, int mid, int end){

    int i,j,k;
    int lsize = mid - start+1;
    int rsize = end - mid;

    int leftarr[lsize], rightarr[rsize];

    for(i = 0 ; i< lsize; i++){
        leftarr[i] = arr[start + i];
    }
    for(j = 0 ; j< rsize; j++){
        rightarr[j] = arr[mid+1+j];
    }

    i = 0;
    j = 0;
    k = start;

     while (i < lsize && j < rsize) {
        if (leftarr[i] <= rightarr[j]) {
            arr[k] = leftarr[i];
            i++;
        }
        else {
            arr[k] = rightarr[j];
            j++;
        }
        k++;
    }

      while (i < lsize) {
        arr[k] = leftarr[i];
        i++;
        k++;
    }

    while (j < rsize) {
        arr[k] = rightarr[j];
        j++;
        k++;
    }
    
 
}
void printArray(int arr[], int size){
    for(int i = 0; i<size;i++){
        printf("%d ",arr[i]);
    }
}
