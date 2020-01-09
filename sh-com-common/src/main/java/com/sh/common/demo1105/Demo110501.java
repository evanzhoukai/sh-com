package com.sh.common.demo1105;

/**
 * @author zhoukai
 * @date 2019/11/15
 */
public class Demo110501 {

    public static void main(String[] args) {
        String cardBuyDayRangeMerge = "123";
        String first = cardBuyDayRangeMerge.substring(0, cardBuyDayRangeMerge.indexOf("~")).trim();
        String second = cardBuyDayRangeMerge.substring(cardBuyDayRangeMerge.indexOf("~") + 1, cardBuyDayRangeMerge.length()).trim();
        System.out.println(first + "=====" + second);
    }
}
