package BT_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("3");
        str.add("3");

        Map<String , Integer> map = new HashMap<>();

        for (String array: str) {
            if (map.containsKey(array)) {
                map.put(array, map.get(array) + 1);
            }else {
                map.put(array, 1);
            }
        }
        System.out.println(map);
    }
}