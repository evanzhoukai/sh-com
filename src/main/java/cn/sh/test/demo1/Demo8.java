package cn.sh.test.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-02-14
 */
public class Demo8 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
