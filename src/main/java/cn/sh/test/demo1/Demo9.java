package cn.sh.test.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhoukai
 * @date 2019-02-14
 */
public class Demo9 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.forEach(item->{
            System.out.println(item);
        });

        System.out.println("---------过滤---------");
        List<String> collect = list.stream().filter(item -> item.contains("a")).collect(Collectors.toList());
        collect.forEach(item ->{
            System.out.println(item);
        });
    }
}
