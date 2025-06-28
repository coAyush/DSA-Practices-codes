import java.util.HashMap;
import java.util.Map;

/* Input: nums = [1,2,2,3,1,4]
   Output: 4
* */
public class CountFrequency {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq=0;
        for(int freq:map.values()){
            if(freq>maxFreq)
                maxFreq=freq;
        }
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            if(maxFreq==m.getValue()){
                sum+=m.getValue();
            }
        }
        System.out.println(sum);
    }

}
