package cn.sh.test.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 集合转数组
 * @author zhoukai
 * @date 2019-02-13
 */
public class Demo5 {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] strings = list.toArray(new String[0]);
        System.out.println(strings.length);
        System.out.println(Arrays.toString(strings));

    }
}
