package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr1[i] > arr2[j]) {
                for (int k = m; k > i; k--) {
                    arr1[k] = arr1[k - 1];
                }
                arr1[i] = arr2[j];
                i++;
                j++;
            } else {
                i++;
            }
        }

    }
}