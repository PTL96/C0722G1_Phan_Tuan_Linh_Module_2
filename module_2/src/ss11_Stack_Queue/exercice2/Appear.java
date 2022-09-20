package ss11_Stack_Queue.exercice2;

import java.util.HashMap;
import java.util.Set;

public class Appear {
    public static void main(String[] args) {
        String str = "hello codeGym, hello world, hello my friend";
        str = str.replaceAll(",","");
        String[] arr = str.split(" ");
        String key;
        Integer value;
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            key = s;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        Set<String> set = map.keySet();
        for (String s : set) {
            key = s;
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
    }

