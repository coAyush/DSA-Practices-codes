package Recursions;

import java.util.ArrayList;
import java.util.List;

public class Maze_PrintPaths_ii {
    public static void main(String[] args) {
       // printPaths("",3,3);
      // List<String> l= printPathsList("",3,3);
       List<String>l=printPathsListDiagonal("",3,3);
        System.out.println(l);
    }
    static void printPaths(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPaths(p+"D",r-1,c);
        }
        if(c>1){
            printPaths(p+"R",r,c-1);
        }
    }
    static ArrayList<String> printPathsList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;

        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1){
            list.addAll(printPathsList(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(printPathsList(p+"R",r,c-1));
        }

        return list;
    }
    static ArrayList<String> printPathsListDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;

        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(printPathsListDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(printPathsListDiagonal(p+"V",r-1,c));
        }
        if(c>1){
            list.addAll(printPathsListDiagonal(p+"H",r,c-1));
        }

        return list;
    }
}