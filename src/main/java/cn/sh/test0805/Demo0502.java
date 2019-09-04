package cn.sh.test0805;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhoukai
 * @date 2019-08-05
 */
public class Demo0502 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String join = StringUtils.join(arr, "&=");
        System.out.println(join);

    }
}
