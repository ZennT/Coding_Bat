package com.data;

/*
Given an int n, return the absolute difference between n and 21,
 except return double the absolute difference if n is over 21.
 */
public class diff {

    public static void main(String[]args){

//        int diff = 0;
//        int n = 0;
//
//        diff=21-n;
//
//        if(n<21) {
//            System.out.println(diff);
//        }

 //       ---------------

        int n = 0;
        int diff = 0;
        //public int diff21(int n) {
            if (n <= 21) {
                return 21 - n;
            } else {
                return (n - 21) * 2;
            }
        }
    }

}
