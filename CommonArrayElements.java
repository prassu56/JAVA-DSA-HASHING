import java.util.Arrays;

public class CommonArrayElements {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 1, 5};
        int[] arr2 = {6, 7, 9, 3, 5};

        System.out.print("Common elements: [");

        boolean first = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(arr1[i]);
                    first = false;
                    break; // avoid counting duplicates
                }
            }
        }

        System.out.println("]");
    }
}
