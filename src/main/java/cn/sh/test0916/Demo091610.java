package cn.sh.test0916;

/**
 * @author zhoukai
 * @date 2019/9/24
 */
public class Demo091610 {
    public static void main(String[] args) throws Exception {

        Foo foo = new Foo();
        Thread thread1 = new Thread(print1(foo));
        Thread thread2 = new Thread(print2(foo));
        Thread thread3 = new Thread(print3(foo));
        thread1.start();
        thread1.join();
        thread2.start();
        thread3.start();

    }

    static Runnable print1(Foo foo) {
        return () -> {
            foo.one();
        };
    }

    static Runnable print2(Foo foo) {
        return () -> {
            foo.two();
        };
    }

    static Runnable print3(Foo foo) {
        return () -> {
            foo.three();
        };
    }


}
