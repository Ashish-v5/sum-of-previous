package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        int n=array.length;
        boolean[] boolArr=new boolean[n];
        boolArr[0]=false;
        boolArr[1]=false;
        for(int i=0;i<n-2;i++){
            if(array[i]+array[i+1]==array[i+2]){
                boolArr[i+2]=true;
            }else{
                boolArr[i+2]=false;
            }
        }
        return boolArr;
    }
}
