package cn.sh.test.demo8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-06-11
 */
public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0, 2);
        list.add(0, 3);
        list.stream().forEach(item -> {
            System.out.println(item);
        });

    }

}
