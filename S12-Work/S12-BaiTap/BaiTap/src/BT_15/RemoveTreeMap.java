package BT_15;

import java.util.TreeMap;

public class RemoveTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(3,3);
        System.out.println(treeMap);

        treeMap.remove(2);
        System.out.println(treeMap);
    }
}
