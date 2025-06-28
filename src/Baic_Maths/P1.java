package Baic_Maths;

public class P1 {
    public static void main(String[] args) {
        int target=3;
        boolean c=check(target);
        System.out.println(c);
    }

    private static boolean check(int target) {
        int i=1;
        for(int j=1; j*j<target;j++){
            if(i*i>target)
                return false;
            if((int)Math.pow(i,2)+(int)Math.pow(j,2)==target){
                return true;
            }
            if ((int)Math.pow(i,2)+(int)Math.pow(j,2)<target){
                i++;
            }
        }
        return false;
    }
}
