package cn.sh.test0909;

import java.util.LinkedList;

/**
 * @author zhoukai
 * @date 2019/9/10
 */
public class Demo090907 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.stream().forEach(val -> System.out.println(val));

    }


}
