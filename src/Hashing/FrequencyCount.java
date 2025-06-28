package Hashing;
import java.util.*;
class FrequencyCount {
    public static void main(String[] args) {
        int [] num={1,2,2,3,1,4};
        int s=maxFrequencyElements(num);
        System.out.println(s);
    }
    public static int maxFrequencyElements(int[] nums) {
        int [] hash=new int [nums.length];
        for (int num : nums) {
            hash[num % nums.length] += 1;
        }
        int last=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int j=1;j<hash.length;j++){
            if(hash[j]>hash[j-1]){
                list.add(hash[j]);
                last=hash[j];
            }
            if(hash[j]>hash[j-1] &&hash[j]==last)
            {
                list.add(hash[j]);
            }
        }
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        return sum;
    }
}
