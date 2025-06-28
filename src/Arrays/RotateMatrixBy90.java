package Arrays;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for(int [] i:arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        System.out.println();
        //brute(arr);
        optimal(arr);
    }

    private static void optimal(int[][] arr) {
        int n= arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int [] i:arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        System.out.println();
     for(int row=0;row<n;row++){
         int j=0;
         int k=arr[row].length-1;
         while (j<k){
             int temp=arr[row][j];
             arr[row][j]=arr[row][k];
             arr[row][k]=temp;
             j++;
             k--;
         }
     }
        for(int [] o:arr){
            System.out.println(Arrays.toString(o));
        }
    }

    private static void brute(int[][] arr) {
        int n= arr.length;
        int m=arr[0].length;
        int [][]newMatrix=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                int element=arr[i][j];
                newMatrix[j][n-i-1]=element;
            }
        }
        for(int [] a:newMatrix)
            System.out.println(Arrays.toString(a));
    }
}
