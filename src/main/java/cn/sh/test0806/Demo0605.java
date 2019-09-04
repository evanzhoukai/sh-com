package cn.sh.test0806;

/**
 * @author zhoukai
 * @date 2019-08-06
 */
public class Demo0605 {

    public static void main(String[] args) {

        demo(1, 2, 4, 6);

    }


    public static void demo() {
        System.out.println("---");
    }

    public static void demo(int i) {
        System.out.println("----1");
    }


    public static void demo(int... i) {
        System.out.println("----2");
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }
}
