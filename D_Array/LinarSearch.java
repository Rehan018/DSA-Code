package D_Array;

import java.util.Scanner;

public class LinarSearch {
    static int linear(int arr[], int size, int element)
    {
        for(int i=0; i<size; i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    static void printArr(int arr[],int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
