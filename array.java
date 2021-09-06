package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main m1 = new Main();
        int [] arr = new int[4];
        arr[0] = 45;
        arr[1] = 20;
        arr[2] = 01;
        arr[3] = 23;

       /* for(int rr : arr) {
            System.out.print(rr + " ");
        }*/
        System.out.println(m1.findLargest(arr));

    }

    int findLargest(int arr[]){
        int temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }

}
