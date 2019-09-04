package cn.sh.test.demo3;

/**
 * @author zhoukai
 * @date 2019-03-26
 */
public class Demo2 {

    public static void main(String[] args) {
        String a = new String("foo");
        String b = new String("foo");
        String c = "foo";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
