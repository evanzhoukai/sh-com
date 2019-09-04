package cn.sh.test.demo1;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 * @author zhoukai
 * @date 2019-02-13
 */
public class Demo7 {

    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(array);
        list.forEach(item ->{
            System.out.println(item);
        });

    }
}
