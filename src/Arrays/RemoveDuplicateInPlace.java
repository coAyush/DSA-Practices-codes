package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
       //  bruteRemove(arr);
         int optimal=optimalRemoveDuplicates(arr);
        System.out.println(optimal);
    }

    public static void  bruteRemove(int[] arr) {
        System.out.println(Arrays.toString(arr));
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int len = set.size();
        Iterator<Integer> itr = set.iterator();
        int i = 0;
        while (itr.hasNext() && i < len) {
            arr[i] = itr.next();
            i++;
        }
        for (; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int optimalRemoveDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i]!= nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
