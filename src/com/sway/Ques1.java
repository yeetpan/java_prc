package com.sway;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
//        System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int temp=n;
        int sumOfRem=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sumOfRem=sumOfRem+rem*rem*rem;

        }
        return sumOfRem==temp;
    }



    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
