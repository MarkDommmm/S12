package TH_01;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Smith", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(map + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashmap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashmap.put("Smith", 30);
        linkedHashmap.put("Anderson", 31);
        linkedHashmap.put("Lewis", 29);
        linkedHashmap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashmap.get("Lewis"));
    }
}