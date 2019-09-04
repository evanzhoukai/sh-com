package cn.sh.test0805;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-08-05
 */
public class Demo0503 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add(null);
        list.add("3");

        System.out.println(list.indexOf(null));
        System.out.println(indexOf(list, null));
    }

    public static int indexOf(List<String> list, Object o) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (o == list.get(i)) {
                return i;
            }
        }
        return -1;
    }
}




