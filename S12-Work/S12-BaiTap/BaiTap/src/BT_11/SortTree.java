package BT_11;

import java.util.TreeMap;

public class SortTree {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 7};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num :arr) {
            treeMap.put(num, 0);
        }
        for (int key : treeMap.keySet()) {
            System.out.println(key + " ");
        }
    }
}
