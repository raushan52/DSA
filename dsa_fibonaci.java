package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(fibSec(6));
    }

    public static int fibSec(int num){

        if(num == 0 || num == 1){
            return num;
        }

        int first = fibSec(num -1);
        int second = fibSec(num -2);
        return first + second;
    }
}
