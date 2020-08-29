package HashMap;

import java.util.HashMap;
import java.util.Map;


public class hasMap_copy {
    public static void main(String[] args) {
        String word = "hello wom\n" + 
                "hello rose\n" + 
                "hello jerry\n" + 
                "hello TBL\n" + 
                "hello kitty\n" + 
                "hello  Kitty\n" + 
                "hello rose\n" + 
                "hello TBL\n" + 
                "hello ZOP\n" +
                "hello ZOP\n" +
                "hello TBL";
        
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] split = word.split("\n");

        for (String w: split) { 
            String[] split1 = w.split(" ");
            
            for (int i = 0; i < split1.length; i++) {
                if (map.containsKey(split1[i])) {
                    Integer integer = map.get(split1);
                    integer++;
                    map.put(split1[i], integer);
                }
                if (!map.containsKey(split1[i])) {
                    map.put(split1[i], 1);
                }
            }
        }
        
        for (Map.Entry<String, Integer> m: map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println("------------------------");

        for (String key: map.keySet()) {
            System.out.println("key= " + key);
        }
        for (Integer value: map.values()) {
            System.out.println("value= " + value);
        }
        System.out.println("------------------------");

        for (String key1: map.keySet()) {
            Integer value1 = map.get(key1);
            System.out.println(key1 + " : " + value1);
        }
    }
}