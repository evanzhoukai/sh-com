package cn.sh.test07.demo2;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class Demo4 {

    /**
     * 饿汉式 单例模式
     */
    private Demo4() {

    }

    private static Demo4 instance = new Demo4();

    public static Demo4 getInstance() {
        return instance;
    }


}
