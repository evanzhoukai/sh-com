package cn.sh.test.demo2;

/**
 * @author zhoukai
 * @date 2019-04-16
 */
public class Demo2 {
    public static void main(String[] args) {

        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c == d);
    }
}
