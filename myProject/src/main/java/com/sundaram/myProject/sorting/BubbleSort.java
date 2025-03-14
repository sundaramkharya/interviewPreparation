package com.sundaram.myProject.sorting;
/*
* works repeatedly by swapping the
* adjacent elements if they are in wrong order*/
public class BubbleSort {
    public void sort(int[] arr){
        boolean swap;
        int n= arr.length;
        int tmp=0;
        for(int i=0;i<n;i++){
            swap=false;
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                    swap=true;
                }
            }if (!swap) break;
        }
    }
    void printArray(int arr[]){
        for(int ele:arr){
            System.out.println(ele+" ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]={64,34,25,12,22,11,90};
        bubbleSort.sort(arr);
        System.out.println("Sorted Array");
        bubbleSort.printArray(arr);
    }
}
