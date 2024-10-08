package com.sway;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
    }

    static  void fun( int ...v){
        // taking as a collection of integers
        System.out.println(Arrays.toString(v));
    }
}
