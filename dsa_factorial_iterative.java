package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {


        System.out.println(recursiveFactorial(20));
        System.out.println(iterativeFactorial(4));

    }

    public static long recursiveFactorial(int num){

        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }

    public static int iterativeFactorial(int num){

        if(num == 0){
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }

        return factorial;
    }
}
