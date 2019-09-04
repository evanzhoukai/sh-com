package cn.sh08.test18;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhoukai
 * @date 2019-08-19
 */
public class Demo1801 {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> list1 = Lists.newArrayList(5, 6, 7, 8);
        List<Integer> list2 = Lists.newArrayList();
        list2 = list.stream().filter(p -> {
            return true;
        }).collect(Collectors.toList());
        list2.stream().forEach(p -> System.out.println(p));


    }


}

