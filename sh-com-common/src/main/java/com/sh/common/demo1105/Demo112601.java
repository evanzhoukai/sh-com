package com.sh.common.demo1105;

/**
 * @author zhoukai
 * @date 2019/11/26
 */
public class Demo112601 {

    /**
     * 默认值是 false
     */
    private static boolean te;

    public static void main(String[] args) {
        boolean sus;
        int i = 0;
        if (i++ == 1) {
            sus = true;
        } else {
            sus = false;
        }

        System.out.println(sus + "====" + i + "===" + te);
    }
}
