import java.util.*;

public class Numberscountusinghasing {
    public static void main(String[] args) {
        int num=112256;
        Map<Integer,Integer> map=new HashMap<>();
        while(num!=0){
            int digit=num%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            num/=10;

        }
        System.out.println(map);

    }
    
}
