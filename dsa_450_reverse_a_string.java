package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "kychbhi";

        //System.out.println(str.length());

        int start = 0;
        int end = str.length()-1;

        returnString(str,start,end);

        printString(str);


    }

    static void returnString(String str, int start, int end){
        if(start == end || start > end){
            return;
        }

        swap(str, start++, end--);


    }

    static void swap(String str, int a, int b){

        if(a == b){
            return;
        }
        int temp = str.charAt(a);
        str.charAt(a) = str.charAt(b);
        str.charAt(b) = temp;
    }

    static void printString(String str){
        System.out.println(str);
    }
}
