package BT_07;

import java.util.HashMap;
import java.util.Map;

public class Copy {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map " +map);
        Map<String,Integer> mapCopy = new HashMap<>();

        mapCopy.putAll(map);
        System.out.println("Map copy "+mapCopy);
    }
}
