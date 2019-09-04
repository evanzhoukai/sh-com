package cn.sh.test.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhoukai
 * @date 2019-03-05
 */
public class Demo12 {

    public static void main(String[] args) {
        String offline = "dd";
        String on = offline + "d";

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(1, 5);
        System.out.println(map.size());
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + "====" + entry.getValue());
        }

    }
}
