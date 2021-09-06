package com.company;


public class Main{
    public static void main(String args[]){
        int rr[] = {6,12,25,41,50,56,89,98};
        int size = rr.length;
        int key = 98;

        int res = binarySearch(rr,0,size-1,key);

        if ((res == -1)) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + res);
        }
    }

    static int binarySearch(int rr[], int start, int end, int key){

        if(end >= 0){
            int mid = (start+end)/2;

            if(rr[mid] == key){
                return mid;
            }
            else if(rr[mid] < key){
                return binarySearch(rr,mid+1,end,key);
            }


            return binarySearch(rr,start,mid-1,key);


        }
        return -1;
    }
}
