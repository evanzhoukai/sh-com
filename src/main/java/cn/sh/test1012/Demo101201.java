package cn.sh.test1012;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zhoukai
 * @date 2019/10/12
 */
public class Demo101201 {
    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<List<Integer>> partition = Lists.partition(list, 2);
        System.out.println(partition.size());
        //partition.stream().forEach(a -> System.out.println(a));
        Lists.partition(list, 2).forEach(a -> a.forEach(b -> System.out.println(b)));

    }
}
