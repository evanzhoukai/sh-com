package cn.sh.test.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-02-13
 */
public class Demo3 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        List<Integer> ints = Arrays.asList(1,3,5);
        ints.forEach(System.out::println);
        List newList = new ArrayList<>(array.length);
        Collections.addAll(newList,array);
        newList.forEach(System.out::println);
        System.out.println(newList.size()+"===");

    }
}
