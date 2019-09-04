package cn.sh.test0805;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoukai
 * @date 2019-08-05
 */
public class Demo0506 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String value = "ja";
        map.put("1", "1");
        map.put("3", "3");
        map.put("2", value);
        map.put("2", value);
        map.put("2", value);
        map.put("2", value);

        System.out.println(map.size());
    }
}
