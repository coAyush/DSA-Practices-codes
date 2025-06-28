package Recursions;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean [][] board={{true,true,true},
                {true,true,true},
                {true,true,true}};
      //  printPaths("",0,0,board);
        int [][]path=new int [board.length][board[0].length];
        printAllPaths("",0,0,board,path,1);
    }
    /*static void printPaths(String p, int r, int c, boolean [][] board) {

        if (r==board.length-1 && c==board[r].length-1) {
            System.out.println(p);
            return;
        }
       if(!board[r][c]){
               return;
       }
       //mark as visited
        board[r][c]=false;
        if (r<board.length-1) {
           printPaths(p + "D", r +1, c,board);
        }
        if (c<board[r].length-1) {
            printPaths(p + "R", r, c+1,board);
        }
        if(r>0){
            printPaths(p+"U",r-1,c,board);
        }
        if(c>0){
            printPaths(p+"L",r,c-1,board);
        }
        board[r][c]=true;
    }*/
    static void printAllPaths(String p, int r, int c, boolean [][] board,int [][]path,int step) {

        if (r==board.length-1 && c==board[r].length-1) {
            path[r][c]=step;
            for(int [] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        //mark as visited
        board[r][c]=false;
        path[r][c]=step;
        if (r<board.length-1) {
            printAllPaths(p + "D", r +1, c,board,path,step+1);
        }
        if (c<board[r].length-1) {
            printAllPaths(p + "R", r, c+1,board,path,step+1);
        }
        if(r>0){
            printAllPaths(p+"U",r-1,c,board,path,step+1);
        }
        if(c>0){
            printAllPaths(p+"L",r,c-1,board,path,step+1);
        }
        board[r][c]=true;
        path[r][c]=0;
    }
}
