package cn.sh.test0805;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-08-05
 */
public class Demo0504 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1-jack");
        list.add("2-jack");
        list.add("3-jack");
        System.out.println(list.size());
        int tmp = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "===循环第" + tmp + "次");
            tmp++;
        }
    }
}
