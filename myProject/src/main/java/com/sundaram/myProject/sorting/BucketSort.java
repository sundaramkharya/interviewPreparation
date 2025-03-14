package com.sundaram.myProject.sorting;

import java.util.Arrays;

/*
* also known as bin sort
* it works by distributing the element into the array also called
* buckets
* */
public class BucketSort {
    public static int [] sort(int[] arr) {
        int i,j;
        int [] bucket=new int[arr.length+1];
        Arrays.fill(bucket,0);
        for(i=0;i<arr.length;i++){
            bucket[arr[i]]++;
        }
        int k =0;
        for(i=0;i<=arr.length;i++){
            for(j=0;j<bucket[i];j++){
                arr[k++]=i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={3,6,1,7,2,8,10,4,9,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
