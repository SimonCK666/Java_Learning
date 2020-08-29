package HashMap;

import java.util.HashMap;
import java.util.Map;


public class hasMap {
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
        
        // 创建 HashMap 对象
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 将 word 以 “\n” 拆分
        String[] split = word.split("\n");

        // 将铲粪后的字符串数组循环取出
        for (String w: split) {
            // 去除每个元素在以空格差分，返回的又是一个字符串数组
            String[] split1 = w.split(" ");
            
            // 循环把 split1 里的元素取出来
            for (int i = 0; i < split1.length; i++) {
                // 判断是否包含指定的键名
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

        // 第二种
        for (String key: map.keySet()) {
            System.out.println("key= " + key);
        }
        for (Integer value: map.values()) {
            System.out.println("value= " + value);
        }
        System.out.println("------------------------");

        // 第三种
        for (String key1: map.keySet()) {
            Integer value1 = map.get(key1);
            System.out.println(key1 + " : " + value1);
        }
    }
}