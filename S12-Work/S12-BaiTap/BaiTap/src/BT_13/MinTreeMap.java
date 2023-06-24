package BT_13;

import java.util.TreeMap;

public class MinTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(3,3);
        System.out.println(treeMap.firstEntry());
    }
}
