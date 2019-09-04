package cn.sh.test0805;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhoukai
 * @date 2019-08-05
 */
public class Demo0505 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("2");
        System.out.println(set.size());


    }
}
