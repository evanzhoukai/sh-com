package cn.sh.test0731;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class Demo3103 {

    /**
     * 私有构造方法。
     * 懒汉式单例模式-线程安全
     * 1，私有构造方法
     */
    private Demo3103() {

    }

    private static volatile Demo3103 instance = null;

    public static Demo3103 getInstance() {
        if (instance == null) {
            synchronized (Demo3103.class) {
                if (instance == null) {
                    instance = new Demo3103();
                }
            }
        }
        return instance;
    }


}
