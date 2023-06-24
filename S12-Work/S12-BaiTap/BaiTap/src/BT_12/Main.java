package BT_12;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 7, 100, 777};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : arr) {
            treeMap.put(num, 0);
        }

        int max = treeMap.lastKey();
        treeMap.remove(max);

        int max2 = treeMap.lastKey();
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
    }
}

