package cn.sh.test.demo3;

/**
 * @author zhoukai
 * @date 2019-04-04
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "123&";
        String l = s.substring(0, s.length() - 1);
        System.out.println(l);
    }
}
