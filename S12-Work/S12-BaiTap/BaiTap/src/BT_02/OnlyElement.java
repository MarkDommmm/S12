package BT_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlyElement {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("mot");
        str.add("hai");
        str.add("ba");
        str.add("ba");

        Map<String, Integer> map = new HashMap<>();
        for (String check : str) {
            if (map.containsKey(check)) {
                map.put(check, map.get(check) + 1);
            } else {
                map.put(check, 1);
            }
        }

        System.out.println(map);
        List<String> newStr = new ArrayList<>();

        for (String only : map.keySet()) {
            if (map.get(only)==1){
                newStr.add(only);
            }
        }
        System.out.println(newStr);
    }
}
