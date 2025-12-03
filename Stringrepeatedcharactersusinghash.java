import java.util.*;
public class Stringrepeatedcharactersusinghash {
    public static void main(String[] args) {
    String str="mississippi";
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<str.length();i++){
        set.add(str.charAt(i));
    }
    System.out.println(set);
}
}
