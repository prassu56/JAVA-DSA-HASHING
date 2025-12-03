import java.util.*;

public class Splittingsentenceusinghash {
    public static void main(String[] args) {

        String str = "Java java JAVA  Code coDe";
        str = str.toLowerCase();

        // Use \\s+ to avoid empty strings
        String arr[] = str.split("\\s+");

        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : map.keySet()) {
            System.out.println(s + " = " + map.get(s));
        }
    }
}
