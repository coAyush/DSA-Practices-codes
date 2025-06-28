package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        // Copy original array before sorting
        int[] original = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr); // For generating permutations in lexicographical order

        // Convert original to List<Integer>
        List<Integer> originalList = new ArrayList<>();
        for (int num : original) originalList.add(num);

        List<List<Integer>> permutations = new ArrayList<>();
        brute(arr, 0, new ArrayList<>(), permutations);

        // Print all permutations
        System.out.println("All permutations:");
        for (List<Integer> p : permutations) {
            System.out.println(p);
        }

        // Find the next permutation
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(originalList)) {
                if (i + 1 < permutations.size()) {
                    System.out.println("Next permutation: " + permutations.get(i + 1));
                } else {
                    System.out.println("Next permutation: No next permutation (last one)");
                }
                break;
            }
        }
    }

    private static List<List<Integer>> brute(int[] arr, int i, List<Integer> current, List<List<Integer>> finali) {
        if (i == arr.length) {
            finali.add(new ArrayList<>(current));
            return finali;
        }

        // Insert at first
        List<Integer> first = new ArrayList<>(current);
        first.add(0, arr[i]);
        brute(arr, i + 1, first, finali);

        // Insert in the middle
        List<Integer> middle = new ArrayList<>(current);
        int index = middle.size() / 2;
        middle.add(index, arr[i]);
        brute(arr, i + 1, middle, finali);

        // Insert at end
        List<Integer> last = new ArrayList<>(current);
        last.add(arr[i]);
        brute(arr, i + 1, last, finali);

        return finali;
    }
}
