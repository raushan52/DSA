#include <stdio.h>
int countingSort(int arr[], int size);
int main() {    
    int arr[] = {1,5,6,4,2,8,3,6,5,4,2,0};
    int size = sizeof(arr)/sizeof(arr[0]);
    countingSort(arr,size);   
}
int countingSort(int arr[], int size){
    int max = arr[0];
    for(int i =0; i<size;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int count[max+1];
    for(int i = 0; i<(sizeof(count)/sizeof(count[0]));i++){
        count[i] = 0;
    }
    for(int i=0;i<size;i++){
        count[arr[i]]++; 
    }    
    int cpp[sizeof(count)/sizeof(count[0])];
    for(int i = 0; i< (sizeof(count)/sizeof(count[0]));++i){
        if(i == 0){
            cpp[i] = count[i];
        }
        if(i > 0){
            cpp[i] = count[i]+cpp[i-1];
        }
    }
    int sortarray[size];
    for(int i = size-1; i>=0;--i){
            sortarray[cpp[arr[i]]-1] = arr[i];
            cpp[arr[i]] = --cpp[arr[i]];
    }
    printf("\n");
    for(int i = 0; i<size;i++){
        printf("%d ",sortarray[i]);
    }

}
