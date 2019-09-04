package cn.sh.test07.demo2;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class SingleDemo {

    private volatile static SingleDemo instance = null;

    private SingleDemo() {

    }

    public static SingleDemo getInstance() {
        if (instance == null) {
            synchronized (SingleDemo.class) {
                if (instance == null) {
                    instance = new SingleDemo();
                }
            }
        }
        return instance;
    }


    public static SingleDemo getInstance2() {
        if (instance == null) {
            instance = new SingleDemo();
        }
        return instance;

    }

}
