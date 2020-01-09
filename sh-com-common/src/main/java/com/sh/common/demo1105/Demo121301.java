package com.sh.common.demo1105;

/**
 * @author zhoukai
 * @date 2019/12/13
 */
public class Demo121301 {

    public static void main(String[] args) {

        int type = 3;
        switch (type) {

            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
                System.out.println("2=====3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("没有");

        }

    }
}
