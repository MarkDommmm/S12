package BT_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("a",6);
        map.put("b",2);
        map.put("c",3);
        map.put("d",1);
        System.out.println("HashMap ban đầu: " + map);

        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList,Map.Entry.comparingByValue());

        for (Map.Entry<String,Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
