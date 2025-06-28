package Recursions;

import java.util.ArrayList;
import java.util.List;

public class Maze_Obstacles {
    public static void main(String[] args) {
        //  List<String>list=printPaths("",3,3);
        boolean[][] board = {{true, true, true},
                {true, false, true},
                {true, true, true}};
        List<String>list=printPaths("", 0, 0, board);
        System.out.println(list);
    }

    /*  static ArrayList<String> printPaths(String p,int r,int c){
          if(r==1 && c==1){
              ArrayList<String>l=new ArrayList<>();
              l.add(p);
              return l;
          }
          ArrayList<String>list=new ArrayList<>();
          if(r==2 & c==3)
              return list;
          if(r>1)
          {
              list.addAll(printPaths(p+"D",r-1,c));
          }
          if (c>1){
              list.addAll(printPaths(p+"R",r,c-1));
          }
          return list;
      }*/
    static ArrayList<String> printPaths(String p, int r, int c,boolean [][] board) {

        if (r==board.length-1 && c==board[r].length-1) {
            ArrayList<String>l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String>list=new ArrayList<>();
        if(!board[r][c]){
            return new ArrayList<>();
        }
        if (r<board.length-1) {
            list.addAll(printPaths(p + "D", r +1, c,board));
        }
        if (c<board[r].length-1) {
            list.addAll(printPaths(p + "R", r, c+1,board));
        }
        return list;
    }
}
