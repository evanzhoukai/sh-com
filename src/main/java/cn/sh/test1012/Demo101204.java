package cn.sh.test1012;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoukai
 * @date 2019/10/31
 */
public class Demo101204 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "2");
        map.put("3", "2");
        map.put("4", "2");
        System.out.println(map.get("666"));

    }
}
