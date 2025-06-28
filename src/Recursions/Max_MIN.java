package Recursions;
public class Max_MIN {
    public static void main(String[] args) {
        int [] arr={1,4,3,-5,-4,8,6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int [] ar=new int[2];
       max_min(arr,min,max,0,ar);

        System.out.println("minimum = "+ar[0]);
        System.out.println("maximum = "+ar[1]);
    }
    static void max_min(int [] arr,int min,int max,int i,int [] ar){
        if(i==arr.length){
            ar[0]=min;
            ar[1]=max;
            return;
        }
        if(arr[i]>max) {
            max=arr[i];
        }
        if(arr[i]<min) {
            min=arr[i];
        }
        max_min(arr,min,max,i+1,ar);

    }
}
