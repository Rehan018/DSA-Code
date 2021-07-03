package D_Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int size1=in.nextInt();
        int size2=in.nextInt();
        int arr[][]=new int[size1][size2];
        for(int arr_i=0; arr_i<size1;  arr_i++){
            for(int arr_j=0; arr_i<size2; arr_j++){
                arr[arr_i][arr_j]=in.nextInt();
            }
        }

        int max=Integer.MIN_VALUE;
        for(int arr_i=0; arr_i<size1; arr_i++){
            for(int arr_j=0; arr_j<size2; arr_j++){
                if((arr_j+2)<size1 && (arr_i +2)<size2){
                    int sum=arr[arr_i][arr_j]
                            +arr[arr_i][arr_j+1]
                            + arr[arr_i][arr_j+2]
                            +arr[arr_i+1][arr_j+1]
                            +arr[arr_i][arr_j+2]
                            +arr[arr_i+1][arr_j+1]
                            +arr[arr_i+2][arr_j]
                            +arr[arr_i+2][arr_j+1]
                            +arr[arr_i+2][arr_j+2];
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
