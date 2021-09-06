package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cons con = new Cons(10,45);
        con.sum();
    }
}

class Cons{

    int a,b;
    final int c =50;
    int arr[] = {1,8,5,2,7,6,9,89,14,2};
    Cons(int a, int b){
        System.out.println(a);
        System.out.println(b);
        this.a =a;
        this.b =b;
    }
    void sum(){
        System.out.println("sum : "+ (a+b));

        try{
            System.out.println(arr[2]);
            System.out.println(24/0);

        }catch (ArrayIndexOutOfBoundsException  exp){
            System.out.println(exp);

        }catch(ArithmeticException sky){
            System.out.println(sky);
        }
        finally {
            System.out.println("Exception handling");
        }

    }
}
