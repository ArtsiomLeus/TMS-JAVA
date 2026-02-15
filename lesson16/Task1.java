package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String str : strings) {
            if (str == null) {
                continue;
            }
            count.put(str, count.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }
        return result;
    }
    public static void main (String[] args) {

        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(arr1));
        System.out.println(wordMultiple(arr2));
        System.out.println(wordMultiple(arr3));
    }
}
