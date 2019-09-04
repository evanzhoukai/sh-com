package cn.sh.test0816;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhoukai
 * @date 2019-08-19
 */
public class Demo081603 {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> list1;

        list1 = list.stream().filter(p -> {

            return false;
        }).collect(Collectors.toList());
        System.out.println(list1.size());
    }
}
