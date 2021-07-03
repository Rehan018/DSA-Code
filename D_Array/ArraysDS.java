package D_Array;

import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=obj.nextInt();
        }
        for(int j=n-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }

    }
}
