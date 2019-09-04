package cn.sh.test07.demo2;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class Demo3 {

    /**
     * 懒汉单例模式
     * 1，私有构造方法
     * 2，静态的成员变量
     * 3，静态的构造方法
     */
    private Demo3() {

    }

    private static Demo3 instance = null;

    public static Demo3 getInstance() {

        if (instance == null) {
            instance = new Demo3();
        }
        return instance;
    }

}
