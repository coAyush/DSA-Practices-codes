package Recursions;
public class Maze_1 {
    public static void main(String[] args) {
        System.out.println("Options available are Right and Down");
        int paths =count(3,3);
        System.out.println("Possible paths are "+paths+" to reach goal(1,1)");
    }
    static int count(int r,int c){
        if(r==1||c==1)
            return 1;
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
}
