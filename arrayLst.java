package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> arr = new ArrayList<>();
        arr.add("kate");
        arr.add("John");
        arr.add("Tim");
        arr.add("lee");
        arr.add("helnski");

        System.out.println(arr.size());
        System.out.println(arr.get(1));
       // System.out.println(arr);
        /*for(String ss : arr){
            System.out.println(ss);
        }*/

        for(int i = 0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        arr.add("ruski");
        System.out.println(arr);
    }
}
