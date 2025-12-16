package Sorting;
import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        int arr[]=new int[]{5,1,3,8,4,6,9,0,5};
        int x=arr.length;
        for(int i=0;i<x;i++){
            int k=0;
            for(int j=1;j<x-i;j++){
                if(arr[k]>arr[j]){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
