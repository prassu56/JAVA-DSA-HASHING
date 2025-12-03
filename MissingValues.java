import java.util.*;

public class MissingValues {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 9};  // example array
        findMissingValues(arr);
    }
    public static void findMissingValues(int[] arr) {
        // Step 1: Put all array elements into a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        // Step 2: Find the min and max value in the array
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        // Step 3: Check which numbers between min and max are missing
        System.out.print("Missing numbers: ");
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
