package Recursions;
//Printing moves in each path;
public class Maze_PrintPaths {
    public static void main(String[] args) {
        printPath("",3,3,0);
    }
    static void printPath(String p,int r,int c,int count){
        if(r==1 && c==1){
            System.out.println("Total possible moves are "+count);
            System.out.println(p);

            return ;
        }
        if(r>1){
           printPath(p+"D",r-1,c,count+1);
            System.out.println(p);
        }
        if(c>1){
            printPath(p+"R",r,c-1,count+1);
            System.out.println(p);
        }
    }
}
