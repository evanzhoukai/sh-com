package cn.sh.test0731;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class Demo3102 {

    public static void main(String[] args) {

    }


    /**
     * 懒汉单例
     * 1，私有构造方法
     */
    private Demo3102() {

    }

    /**
     * 多线程，不安全。会有多个实例
     */
    private static Demo3102 instance = null;

    /**
     * 获取实例
     *
     * @return
     */
    public static Demo3102 getInstance() {
        if (instance == null) {
            instance = new Demo3102();
        }
        return instance;
    }


}
