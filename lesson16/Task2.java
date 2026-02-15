package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static Map<String,String> pairs(String[] words) {
        HashMap<String, String> map = new HashMap<>();
        for (String word : words) {
            if(word != null & word.length() > 0) {
                String key = word.substring(0,1);
                String value = word.substring(word.length() -1);
                map.put(key, value);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] example1 = {"code", "bug"};
        String[] example2 = {"man", "moon", "main"};
        String[] example3 = {"man", "moon", "good", "night"};

        System.out.println(pairs(example1));
        System.out.println(pairs(example2));
        System.out.println(pairs(example3));
    }
}
