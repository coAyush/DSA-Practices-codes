package Arrays;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int [] [] arr={{1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}};
        int n=4,m=4;
        for (int [] i:arr){
            System.out.print(Arrays.toString(i));
            System.out.println();
        }
    //    brute(arr,n,m);
        better(arr,n,m);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int [] i:arr){
            System.out.print(Arrays.toString(i));
            System.out.println();
        }

    }

    private static void better(int[][] arr, int n, int m) {
        int [] row=new int[n];
        int [] col=new int[m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[i]=1;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }

    private static void brute(int[][] arr,int n,int m) {
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    markRow(i,m,arr);
                    markCol(j,n,arr);
                }
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }

    private static void markRow(int row,int m,int [][]arr) {
        for (int j=0; j < m; j++) {
            if (arr[row][j] != 0) {
                arr[row][j] = -1;
            }
        }
    }

    private static void markCol(int col,int n,int [][]arr) {
        for(int i=0;i<n;i++){
            if(arr[i][col]!=0){
                arr[i][col]=-1;
            }
        }
    }
}
