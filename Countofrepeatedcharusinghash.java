import java.util.*;

public class Countofrepeatedcharusinghash {
    public static void main(String[] args) {

        String str = "mississippi";
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char i : str.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Character i : map.keySet()) {
            System.out.println(i + " = " + map.get(i));
        }
    }
}
