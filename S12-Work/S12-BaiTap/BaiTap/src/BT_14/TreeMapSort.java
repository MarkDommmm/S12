package BT_14;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(3,3);
        System.out.println(treeMap);
    }
}
