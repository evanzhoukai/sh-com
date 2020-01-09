package com.sh.common.demo1105;

import cn.mwee.base_common.utils.date.MwDateUtil;

/**
 * @author zhoukai
 * @date 2019/12/2
 */
public class Demo120201 {

    public static void main(String[] args) {
        int diffDay = MwDateUtil.diffDay(MwDateUtil.getString2Date("1970-01-01 00:00:00"), MwDateUtil.getString2Date("2019-12-02 00:00:00"));
        System.out.println(diffDay);
    }
}
