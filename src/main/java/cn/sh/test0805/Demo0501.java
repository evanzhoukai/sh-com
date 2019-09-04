package cn.sh.test0805;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-08-05
 */
public class Demo0501 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        String join = join(list.iterator(), "&=");
        System.out.println(join);


    }

    public static String join(Iterator<?> iterator, String spilt) {
        if (iterator == null || spilt == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object first = iterator.next();
        stringBuilder.append(first);
        while (iterator.hasNext()) {
            if (spilt != null) {
                stringBuilder.append(spilt);
            }
            Object item = iterator.next();
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }

}
