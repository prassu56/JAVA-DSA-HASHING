import java.util.*;

public class CommonArrayElementsUsingHashmap {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 7, 6, 5, 3};
        int[] arr2 = {8, 5, 3, 2, 0, 0};

        HashSet<Integer> set = new HashSet<>(); 
        for (int i : arr1) {
            set.add(i);
        }

        System.out.println("Common elements:");
        for (int j : arr2) {
            if (set.contains(j)) {
                System.out.print(j + " ");
                set.remove(j); 
            }
        }
    }
}