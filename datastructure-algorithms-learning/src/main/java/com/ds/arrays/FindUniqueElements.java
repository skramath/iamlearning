package com.ds.arrays;

import java.lang.reflect.Array;

public class FindUniqueElements {

   // Java program to print unique elements from below array using only core java:-
   // I/p (2,3,3,4,5,5,6)
   // O/p (2,4,6)

    public static void main(String[] args) {
        Integer[] intArr = {2,3,3,4,5,5,6};


        for(int i=0;i<intArr.length;i++){

            for(int k=intArr.length-1;k>0;k--) {
                if(intArr[i] == intArr[k]){
                    break;
                }
                if(k == intArr.length-1){
                    System.out.println(intArr[i]);
                }
            }
        }
    }
}
