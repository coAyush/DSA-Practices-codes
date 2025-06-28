public class sorting {
    public static void main(String[] args) {
        int [] arr={1,2,4,3,5};
        boolean c=check(arr,0);
        if(c)
            System.out.println("sorted");
        else
            System.out.println("not ");
    }
    static boolean check(int [] arr,int i){
        if(i== arr.length-1)
            return true;
        return arr[i]<arr[i+1]&&check(arr,i+1);
    }
}
