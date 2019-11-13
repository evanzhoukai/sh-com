package cn.sh.test1012;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zhoukai
 * @date 2019/11/13
 */
public class Demo101210 {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2);
        System.out.println(list);
        int arr[] = {1, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
