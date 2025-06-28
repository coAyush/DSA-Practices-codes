package Prac;

public class TOH {
    public static void main(String[] args) {
        int disk=2;
        String s="source",d="destination",h="auxiliary";
        Tower(disk,s,d,h);
    }
    public static void Tower(int n,String s,String d,String h){
        if(n==1)
        {
            System.out.println("Move from "+s+"to "+d);
            return;
        }
        Tower(n-1,s,h,d);
        System.out.println("Move "+(n-1)+" disks from "+s+"to "+d);
        Tower(n-1,h,d,s);


    }
}
