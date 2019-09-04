package cn.sh.test.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 集合转数组
 * @author zhoukai
 * @date 2019-02-13
 */
public class Demo6 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
    }
}
