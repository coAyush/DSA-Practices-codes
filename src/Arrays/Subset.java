//Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
package Arrays;

import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        boolean chec = check(arr1, arr2);
        System.out.println(chec);
    }

    private static boolean check(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return true;
    }
}
