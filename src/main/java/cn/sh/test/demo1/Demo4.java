package cn.sh.test.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  数据转集合
 * @author zhoukai
 * @date 2019-02-13
 */
public class Demo4 {

    public static void main(String[] args) {
        String[] array = {"a","b","c"};
        List<String> resultList = new ArrayList<>(array.length);
        Collections.addAll(resultList,array);


        List<String> strings = Arrays.asList(array);
        System.out.println(strings.size());
    }
}
