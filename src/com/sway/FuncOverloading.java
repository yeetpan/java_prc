package com.sway;

public class FuncOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Shrek");
    }

    // function overloading is done at compile time.
    static void fun(int a){
        System.out.println(a);
    }
    static void fun (String b){
        System.out.println(b);
    }
    // another noob case of function overloading.
    static int fn(int a, int b){
        return  a+b;
    }

    static int fn(int a, int b,int c){
        return  a+b+c;
    }
}
